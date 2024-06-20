package strategy;

import model.Cab;

import java.util.List;

public class NearestCabSelectionStrategy extends CabSelectionStrategy{
    @Override
    public Cab selectCabs(List<Cab> cabsList) {
        return cabsList.get(0);
    }
}
