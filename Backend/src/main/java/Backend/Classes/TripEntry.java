package Backend.Classes;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public class TripEntry {

    private String vehicleId;
    private double lat;
    private double lon;
    private int alt;
    private LocalDate dateTime;
    private int speed;
    private int speedLimit;
    private int roadType;
    private boolean ignition;



    public TripEntry(String vehicleId, double lat, double lon, int alt, LocalDate dateTime, int speed, int speedLimit, int roadType) {
        this.vehicleId = vehicleId;
        this.lat = lat;
        this.lon = lon;
        this.alt = alt;
        this.dateTime = dateTime;
        this.speed = speed;
        this.speedLimit = speedLimit;
        this.roadType = roadType;
    }

    public TripEntry(String vehicleId, double lat, double lon, int alt, LocalDate dateTime, int speed, int speedLimit, int roadType, boolean ignition) {
        this.vehicleId = vehicleId;
        this.lat = lat;
        this.lon = lon;
        this.alt = alt;
        this.dateTime = dateTime;
        this.speed = speed;
        this.speedLimit = speedLimit;
        this.roadType = roadType;
        this.ignition = ignition;
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

    public LocalDate getDateTime() {
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

    public void setDateTime(LocalDate dateTime) {
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
