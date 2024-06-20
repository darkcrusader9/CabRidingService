package model;

import java.util.ArrayList;
import java.util.List;

public class Rider extends User{
    List<Trip> tripHistory;
    Location location;
    public Rider(String userId, String password, String name) {
        super(userId, password, name);
        tripHistory = new ArrayList<>();
    }

    public void addTrip(Trip trip){
        tripHistory.add(trip);
    }


}
