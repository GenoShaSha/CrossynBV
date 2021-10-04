package Backend.Classes;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TripEntry {

    private String vehicleId;
    private double lat;
    private double lon;
    private int alt;
    private String dateTime;
    private int speed;
    private int speedLimit;
    private int roadType;
    private boolean ignition;



public TripEntry(){

}


    public String getVehicleID() {
        return vehicleId;
    }

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }

    public int getAlt() {
        return alt;
    }

    public String getDateTime() {
        return dateTime;
    }

    public int getSpeed() {
        return speed;
    }

    public int getSpeedlimit() {
        return speedLimit;
    }

    public int getRoadType() {
        return roadType;
    }

    public boolean isIgnition() {
        return ignition;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public void setAlt(int alt) {
        this.alt = alt;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }

    public void setRoadType(int roadType) {
        this.roadType = roadType;
    }

    public void setIgnition(boolean ignition) {
        this.ignition = ignition;
    }
}
