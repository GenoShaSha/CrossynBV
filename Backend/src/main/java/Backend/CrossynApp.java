package Backend;
import Backend.Accepter.TripEntryAccepter;
import Backend.Classes.TripEntry;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


@SpringBootApplication
public class CrossynApp {

    public static void main(String a[]) throws IOException {

        BufferedReader bufReader = new BufferedReader(new FileReader("src\\main\\java\\Backend\\DataStream\\dataset1.txt"));


        String line = bufReader.readLine();
        String finalLine = "";
        while (line != null) {
            finalLine = finalLine+line;
            line = bufReader.readLine();
        }
        //System.out.println(finalLine);
        bufReader.close();

        TripEntryAccepter TE = new TripEntryAccepter();
        List<TripEntry> list = TE.TurnJSONStringToObject(finalLine);

        List<TripEntry> BrokenSpeeds = new LinkedList<>();

        for (TripEntry entry : list) {
            if (entry.getSpeed() > entry.getSpeedlimit())
            {
                BrokenSpeeds.add(entry);
            }
        }
        System.out.println("Speed Limit broken: " + BrokenSpeeds.size());
        System.out.println("Do you want to see the entries Where speed was broken? (Y/N)");
        if(Prompt())
        {
            for (TripEntry Entry : BrokenSpeeds)
            {
                System.out.println(Entry);
            }
        }
        }

        public static boolean Prompt() throws IOException {
            // Enter data using BufferReader
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));

            // Reading data using readLine
            String input = reader.readLine();
            if(input.equals("Y")||input.equals("y"))
            {
                return true;
            }
            else if (input.equals("N")||input.equals("n"))
            {
                return false;
            }
            else
            {
                System.out.println("Please Try again");
                return Prompt();
            }

        }



}
