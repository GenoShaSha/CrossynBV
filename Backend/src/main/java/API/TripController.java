package API;

import Backend.Classes.Trip;
import Backend.Classes.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/Trips")


public class TripController {
    private static final FakeUserData data = new FakeUserData();

    @PostMapping("/Trips")
    public List<Trip> getAllTrips(@RequestBody Long id){
        return null;
    }

}
