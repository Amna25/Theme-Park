import attractions.*;
import behaviours.IReviewed;
import stalls.*;

import java.util.ArrayList;
import java.util.Collection;

public class ThemePark {

    private ArrayList<Attraction>attractions;
    private ArrayList<Stall>stalls;

    public ThemePark() {
        this.attractions = new ArrayList<Attraction>();
        this.stalls = new ArrayList<Stall>();
    }

    public void addAttraction(Attraction attraction) {
         this.attractions.add(attraction);
    }

    public void addStalls(Stall stall) {
        this.stalls.add(stall);
    }

    public int countTotalCollection(){
        return this.attractions.size() + this.stalls.size();
    }

    public ArrayList<IReviewed> getAlReviewed() {
        ArrayList<IReviewed> reviewed = new ArrayList<IReviewed>(this.attractions);
        reviewed.addAll(this.stalls);
        return reviewed;
    }


}
