package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class Location {
    double x;
    double y;

    public double getDistance(Location destination){
        return Math.sqrt(this.x * destination.x + this.y + destination.y);
    }
}
