import manager.CabsManager;
import manager.RiderManager;
import manager.TripsManager;
import model.Cab;
import model.Location;

public class CabApplication {
    CabsManager cabsManager = new CabsManager();
    RiderManager riderManager = new RiderManager();
    TripsManager tripsManager = new TripsManager();

    Cab cab1 = new Cab("1", "Ashok", new Location(0.0, 1.0));
    Cab cab2 = new Cab("2", "Ram", new Location(5.0, 10.0));
    Cab cab3 = new Cab("3", "Shyam", new Location(20.0, 25.0));

    cabs

}
