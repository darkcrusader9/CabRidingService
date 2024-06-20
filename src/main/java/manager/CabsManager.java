package manager;

import lombok.Getter;
import model.Cab;
import model.Location;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
public class CabsManager {
    Map<String, Cab> cab
    public CabsManager(){
        cabs = new HashMap<>();
    }

    public void addCab(String cabId){
        cabList.add(cab);
    }
    public void removeCab(Cab cab){
        cabList.remove(cab);
    }

    public List<Cab> getAvailableCabs(Location point, double distance) throws Exception {
        List<Cab> availableCabs = new ArrayList<>();
        for(Cab cab : cabList){
            if(point.getDistance(cab.getLocation()) <= distance && cab.isAvailable()){
                availableCabs.add(cab);
            }
        }
        if(availableCabs.isEmpty()){
            throw new Exception("No Cabs Available");
        }
        return availableCabs;
    }
}
