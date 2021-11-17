package API;

import Backend.Classes.Trip;
import Backend.Classes.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/Trips")


public class TripController {

    private FakeTripData data = new FakeTripData();

    @GetMapping
    public ResponseEntity<List<Trip>> getAllTrips(@RequestBody Long id){
        List<Trip> test = null;

        test = data.getS();

        if(test != null){
            return ResponseEntity.ok().body(test);
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }

}
