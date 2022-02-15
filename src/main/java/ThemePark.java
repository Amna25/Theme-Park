import attractions.Attraction;
import behaviours.IReviewed;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Attraction>attraction;
    private ArrayList<Stall>stalls;

    public ThemePark() {
        this.attraction = new ArrayList<>();
        this.stalls = new ArrayList<>();
    }

    public ArrayList<Attraction> getAttractionCount() {
        return attraction;
    }

    public ArrayList<Stall> getStallsCount() {
        return stalls;
    }

    public String getAlReviewed(IReviewed iReviewed){
        return iReviewed.getName();
    }
}
