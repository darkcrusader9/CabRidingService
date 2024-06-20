package manager;

import lombok.NonNull;
import model.Rider;

import java.util.HashMap;
import java.util.Map;

public class RiderManager {
    Map<String, Rider> riders = new HashMap<>();

    public void createRider(@NonNull final Rider newRider) {
        riders.put(newRider.getUserId(), newRider);
    }

    public Rider getRider(@NonNull final String riderId) {
        return riders.get(riderId);
    }
}
