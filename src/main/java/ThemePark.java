import attractions.Attraction;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Attraction>attraction;
    private ArrayList<Stall>stalls;

    public ThemePark() {
        this.attraction = new ArrayList<>();
        this.stalls = new ArrayList<>();
    }

    public ArrayList<Attraction> getAttraction() {
        return attraction;
    }

    public ArrayList<Stall> getStalls() {
        return stalls;
    }

    
}
