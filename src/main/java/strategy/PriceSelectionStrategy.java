package strategy;

import model.Cab;
import model.Location;
import model.Trip;

public interface PriceSelectionStrategy {
    public double getCost(Location from, Location to, Cab cab);
}
