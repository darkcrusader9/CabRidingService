package strategy;

import model.Cab;

import java.util.List;

public interface CabSelectionStrategy {
    public Cab selectCabs(List<Cab> cabsList);
}
