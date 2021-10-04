package Backend.Acceptor;

import Backend.Algorithm.TripEntryAlgorithm;
import Backend.Classes.TripEntry;

import java.util.ArrayList;

public class TripEntryAccepter {

    private TripEntryAlgorithm algorithm;
    private ArrayList<TripEntry> entries;

    public TripEntryAccepter() {
        algorithm = new TripEntryAlgorithm();
        entries = new ArrayList<TripEntry>();
    }
}
