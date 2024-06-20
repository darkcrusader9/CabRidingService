package strategy;

import model.Cab;
import model.Location;

public class StaticPriceSelectionStrategy implements PriceSelectionStrategy{
    @Override
    public double getCost(Location from, Location to, Cab cab) {
        return from.getDistance(to) * 10.0;
    }
}
