package Backend;
import Backend.Classes.TripEntry;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class CrossynApp {

    public static void main(String a[]) throws IOException {

        BufferedReader bufReader = new BufferedReader(new FileReader("src\\main\\java\\Backend\\DataStream\\dataset1.txt"));
        ArrayList<String> listOfLines = new ArrayList<>();

        String k = "";
        String line = bufReader.readLine();
        String finalLine = "";
        while (line != null) {
            finalLine = finalLine+line;
            line = bufReader.readLine();
        }
        //System.out.println(finalLine);
        bufReader.close();

        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());

        TypeReference<List<TripEntry>> listType = new TypeReference<>() {};
        List<TripEntry> list = mapper.readValue(finalLine, listType);

        for (TripEntry entry : list)
        {
            if(entry.getSpeedlimit() < entry.getSpeed()){

                System.out.print(entry.getSpeed());
                System.out.print(":");
                System.out.println(entry.getSpeedlimit());
                System.out.print(entry.getDateTime());
                System.out.println("");
            }

        }



//        ArrayList<TripEntry> pls = new ArrayList<>();
//
//       for (String p: listOfLines) {
//            JSONObject plss = new JSONObject(p);
//            pls.add(plss);
//
//        }






//
//        ArrayList<TripEntry> temp = new ArrayList<TripEntry>();
//
//        ObjectMapper mapper = new ObjectMapper();
//
//
//        for (String b: listOfLines) {
//            System.out.println(b);
//            TripEntry tripEntry = mapper.readValue(b, TripEntry.class);
//            temp.add(tripEntry);
//            System.out.println(temp.stream().count());
//        }



        /* Gson g = new Gson();
        for (String b : listOfLines) {

            TripEntry temp2 = g.fromJson(b,TripEntry.class);
            temp.add(temp2);
        }

        System.out.println(temp.stream().count()); */


    }
}
