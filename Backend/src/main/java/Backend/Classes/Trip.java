package Backend.Classes;

import Backend.Interfaces.*;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.ArrayList;

public class Trip{

    private String vehicleId;
    private ZonedDateTime startTime;
    private ZonedDateTime endTime;
    private boolean currentlyOngoing;

    private ArrayList<TripEntry> Entries;


    public Trip(String vehicleId, ZonedDateTime startTime, ZonedDateTime endTime, boolean currentlyOngoing) {
        this.vehicleId = vehicleId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.currentlyOngoing = currentlyOngoing;
        Entries = new ArrayList<TripEntry>();
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public ZonedDateTime getStartTime() {
        return startTime;
    }

    public ZonedDateTime getEndTime() {
        return endTime;
    }

    public boolean isCurrentlyOngoing() {
        return currentlyOngoing;
    }

    public void setEndTime(ZonedDateTime endTime) {
        this.endTime = endTime;
    }

    public void setCurrentlyOngoing(boolean currentlyOngoing) {
        this.currentlyOngoing = currentlyOngoing;
    }


    public boolean AddTripEntry(Object a) {
        if (a != null){
            Entries.add((TripEntry) a);
            return true;
        }
        else {
            return false;
        }

    }

    public boolean RemoveTripEntry(Object a) {
        if (a != null){
            Entries.remove((TripEntry) a);
            return true;
        }
        else {
            return false;
        }
    }

    public ArrayList<Object> GetAllTripEntries() {
        ArrayList<Object> replacement = new ArrayList<Object>();

        for (TripEntry a: Entries) {
            replacement.add(a);
        }
        return replacement;
    }

    public String toString(){
        return "Trip with vehicle id: "+ this.getVehicleId() + "Started at : " + this.getStartTime() + " and ended at : " + this.getEndTime() + " the status is:" + this.isCurrentlyOngoing();
    }
}
