package Backend.Algorithm;

import Backend.Classes.Trip;
import Backend.Classes.TripEntry;

import java.lang.reflect.Array;
import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

public class Algorithm
{
    private List<Trip> trips=new ArrayList<Trip>();


    public Algorithm(){
        trips = new ArrayList<>();
    }

    public List<Trip> MakeTrips (List<TripEntry> entries) {

        
        TripEntry OldEntry = null;
        int count = 0;


        for (TripEntry entry : entries) {
            if (trips.stream().count() > 0) {
                for (Trip currenttrips : trips) {
                    if (currenttrips.isCurrentlyOngoing() == true){
                        if (currenttrips.getVehicleId().equals(entry.getVehicleID())) {
                            currenttrips.AddTripEntry(entry);
                        }
                    }
                }

                boolean allEnded = trips.stream().allMatch(x -> x.isCurrentlyOngoing() == false);

                if (allEnded == true){
                    Trip newTrip = new Trip(entry.getVehicleID(), entry.getDateTime(), null, true);
                    trips.add(newTrip);
                    OldEntry = null;
                }

                if(OldEntry == null)
                {
                    OldEntry = entry;
                }
                else
                {

                    Duration between = Duration.between(OldEntry.getDateTime().toLocalTime(),entry.getDateTime().toLocalTime());
                    if( between.toMinutes() >= 5){

                        for (Trip currenttrips : trips) {
                            if (currenttrips.isCurrentlyOngoing() == true){
                                if (currenttrips.getVehicleId().equals(entry.getVehicleID())){
                                    currenttrips.setEndTime(OldEntry.getDateTime());
                                    currenttrips.setCurrentlyOngoing(false);
                                }

                           }

                        }

                        }

                    }
                    OldEntry = entry;

            }
            else {
                Trip newTrip = new Trip(entry.getVehicleID(), entry.getDateTime(), null, true);
                trips.add(newTrip);
            }
        }
        return trips;
    }

}
