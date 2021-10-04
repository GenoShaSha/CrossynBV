package Backend;
import Backend.Classes.Trip;
import Backend.Classes.TripEntry;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.tomcat.util.json.JSONParser;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


@SpringBootApplication
public class CrossynApp {

    public static void main(String a[]) throws IOException {

        BufferedReader bufReader = new BufferedReader(new FileReader("C:\\GITWORK\\test\\src\\main\\java\\Backend\\DataStream\\dataset1.txt"));
        ArrayList<String> listOfLines = new ArrayList<>();

        String line = bufReader.readLine();
        while (line != null) {
            listOfLines.add(line);
            line = bufReader.readLine();

        }
        bufReader.close();

        System.out.println(listOfLines.stream().count());


//        for (String p: listOfLines) {
//            JSONObject plss = new JSONObject(p);
//            pls.add(plss);
//
//        }





//
//
//        ArrayList<TripEntry> temp = new ArrayList<TripEntry>();
//        BufferedReader br = new BufferedReader(new FileReader("C:\\GITWORK\\test\\src\\main\\java\\Backend\\DataStream\\dataset1.txt"));
//
//
//        ObjectMapper mapper = new ObjectMapper();
//
//
//        for (String b: listOfLines) {
//            TripEntry tripEntry = mapper.readValue(b, TripEntry.class);
//            temp.add(tripEntry);
//            System.out.println(temp.stream().count());
//        }
//
//

        /* Gson g = new Gson();
        for (String b : listOfLines) {

            TripEntry temp2 = g.fromJson(b,TripEntry.class);
            temp.add(temp2);
        }

        System.out.println(temp.stream().count()); */


    }
}
