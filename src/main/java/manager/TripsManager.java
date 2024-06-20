package manager;

import enums.CabStatus;
import enums.TripStatus;
import model.Cab;
import model.Location;
import model.Rider;
import model.Trip;
import strategy.CabSelectionStrategy;
import strategy.PriceSelectionStrategy;

import java.util.List;

public class TripsManager {
    CabsManager cabsManager;
    CabSelectionStrategy cabSelectionStrategy;
    PriceSelectionStrategy priceSelectionStrategy;
    public TripsManager(CabSelectionStrategy cabSelectionStrategy, PriceSelectionStrategy priceSelectionStrateg){
        this.cabSelectionStrategy = cabSelectionStrategy;
        this.priceSelectionStrategy = priceSelectionStrateg;
        this.cabsManager = new CabsManager();
    }
    public void createTrip(Rider rider, Location fromPoint, Location toPoint){
        List<Cab> cabsAvailable = cabsManager.getCabList();
        Cab selectedCab = cabSelectionStrategy.selectCabs(cabsAvailable);
        double tripCost = priceSelectionStrategy.getCost(fromPoint, toPoint, selectedCab);
        Trip newTrip = new Trip(rider, selectedCab, tripCost, fromPoint, toPoint);

        newTrip.setTripStatus(TripStatus.IN_PROGRESS);
        selectedCab.setAvailable(false);
        selectedCab.addTrip(newTrip);
    }
    public void endTrip(Trip trip){
        trip.setTripStatus(TripStatus.COMPLETED);
        trip.getCab().setAvailable(true);
    }
}
