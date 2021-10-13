package Backend;
import Backend.Accepter.TripEntryAccepter;
import Backend.Algorithm.Algorithm;
import Backend.Classes.Trip;
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
import java.util.Scanner;


@SpringBootApplication
public class CrossynApp {


    public static void main(String a[]) throws IOException {

            while(true){
                Algorithm test1 = new Algorithm();
                TripEntryAccepter TE = new TripEntryAccepter();

                String finalLine = TE.BigLine();

                List<TripEntry> list = TE.TurnJSONStringToObject(finalLine);
                List<Trip> Test = new ArrayList<Trip>();
                Test = test1.MakeTrips(list);

                for (Trip test2 : Test) {
                    System.out.println(test2);

                }
            }

        }

//
// TODO: ASKING YOU IF YOU WANT TO SEE WHEN YOU BREAK THE SPEED LIMIT

//    public static boolean Prompt() throws IOException {
//        // Enter data using BufferReader
//        BufferedReader reader = new BufferedReader(
//                new InputStreamReader(System.in));
//
//        // Reading data using readLine
//        String input = reader.readLine();
//        if(input.equals("Y")||input.equals("y"))
//        {
//            return true;
//        }
//        else if (input.equals("N")||input.equals("n"))
//        {
//            return false;
//        }
//        else
//        {
//            System.out.println("Please Try again");
//            return Prompt();
//        }
//
//    }


//     TODO:           SpeedLimit Breaking

//    List<TripEntry> BrokenSpeeds = new LinkedList<>();
//
//                for (TripEntry entry : list) {
//        if (entry.getSpeed() > entry.getSpeedlimit())
//        {
//            BrokenSpeeds.add(entry);
//        }
//    }
//                System.out.println("Speed Limit broken: " + BrokenSpeeds.size());
//                System.out.println("Do you want to see the entries Where speed was broken? (Y/N)");
//                if(Prompt())
//    {
//        for (TripEntry Entry : BrokenSpeeds)
//        {
//            System.out.println(Entry);
//        }
//    }
//}
    }




