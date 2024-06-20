package model;

import enums.CabStatus;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Cab {
    String cabId;
    String driverName;
    CabStatus cabStatus;
    boolean isAvailable;
    Trip currentTrip;
    List<Trip> tripsCompleted;
    Location location;
    public void addTrip(Trip trip){
        tripsCompleted.add(trip);
    }
    public Cab(String cabId, String driverName, Location initialLocation){
        this.cabId = cabId;
        this.driverName = driverName;
        this.cabStatus = CabStatus.NOT_STARTED;
        this.isAvailable = true;
        this.currentTrip = null;
        this.tripsCompleted = new ArrayList<>();
        this.location = initialLocation;
    }
}
