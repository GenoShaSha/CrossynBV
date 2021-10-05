package Backend.Classes;

import Backend.Interfaces.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Trip implements IManager {

    private String vehicleId;
    private LocalDate startTime;
    private LocalDate endTime;
    private boolean currentlyOngoing;

    private ArrayList<TripEntry> Entries;


    public Trip(String vehicleId, LocalDate startTime, LocalDate endTime, boolean currentlyOngoing) {
        this.vehicleId = vehicleId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.currentlyOngoing = currentlyOngoing;
        Entries = new ArrayList<TripEntry>();
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public LocalDate getEndTime() {
        return endTime;
    }

    public boolean isCurrentlyOngoing() {
        return currentlyOngoing;
    }

    public void setEndTime(LocalDate endTime) {
        this.endTime = endTime;
    }

    public void setCurrentlyOngoing(boolean currentlyOngoing) {
        this.currentlyOngoing = currentlyOngoing;
    }

    @Override
    public boolean AddObject(Object a) {
        if (a != null){
            Entries.add((TripEntry) a);
            return true;
        }
        else {
            return false;
        }

    }

    @Override
    public boolean RemoveObject(Object a) {
        if (a != null){
            Entries.remove((TripEntry) a);
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public ArrayList<Object> GetAllObjects() {
        ArrayList<Object> replacement = new ArrayList<Object>();

        for (TripEntry a: Entries) {
            replacement.add(a);
        }
        return replacement;
    }
}
