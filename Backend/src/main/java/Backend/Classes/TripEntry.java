package Backend.Classes;

import java.time.LocalDate;

public class TripEntry {

    private String vehicleID;
    private double lat;
    private double lon;
    private int alt;
    private LocalDate dateTime;
    private int speed;
    private int speedlimit;
    private int roadType;
    private boolean ignition;


    public TripEntry(String vehicleID, double lat, double lon, int alt, LocalDate dateTime, int speed, int speedlimit, int roadType, boolean ignition) {
        this.vehicleID = vehicleID;
        this.lat = lat;
        this.lon = lon;
        this.alt = alt;
        this.dateTime = dateTime;
        this.speed = speed;
        this.speedlimit = speedlimit;
        this.roadType = roadType;
        this.ignition = ignition;
    }

    public String getVehicleID() {
        return vehicleID;
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
        return speedlimit;
    }

    public int getRoadType() {
        return roadType;
    }

    public boolean isIgnition() {
        return ignition;
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

    public void setRoadType(int roadType) {
        this.roadType = roadType;
    }

    public void setIgnition(boolean ignition) {
        this.ignition = ignition;
    }
}
