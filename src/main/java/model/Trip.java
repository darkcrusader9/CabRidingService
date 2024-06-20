package model;

import enums.TripStatus;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import static enums.TripStatus.IN_PROGRESS;

@Getter
@Setter
public class Trip {
    Rider rider;
    Cab cab;
    double price;
    TripStatus tripStatus;
    Location source;
    Location destination;

    public Trip(
            @NonNull final Rider rider,
            @NonNull final Cab cab,
            @NonNull final Double price,
            @NonNull final Location fromPoint,
            @NonNull final Location toPoint) {
        this.rider = rider;
        this.cab = cab;
        this.price = price;
        this.source = fromPoint;
        this.destination = toPoint;
        this.tripStatus = IN_PROGRESS;
    }
}
