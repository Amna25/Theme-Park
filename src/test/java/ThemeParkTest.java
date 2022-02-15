import attractions.Attraction;
import attractions.Dodgems;
import attractions.Playground;
import attractions.RollerCoaster;
import behaviours.IReviewed;
import org.junit.Before;
import org.junit.Test;
import stalls.IceCreamStall;
import stalls.ParkingSpot;

import static junit.framework.TestCase.assertEquals;

public class ThemeParkTest {
    ThemePark themePark;
    Dodgems dodgems;
    Playground playground;
    RollerCoaster rollerCoaster;
    IceCreamStall iceCreamStall;


    @Before
    public void before(){
        themePark = new ThemePark();
        dodgems = new Dodgems("Bumber Cars", 5);
        playground = new Playground("MorningSide Park", 5);
        rollerCoaster = new RollerCoaster("Big Dipper", 3);
        iceCreamStall = new IceCreamStall("Over HIll","Mike", ParkingSpot.A1);
    }

    @Test
    public void canStoreAttractions(){
        themePark.addAttraction(playground);
        themePark.addStalls(iceCreamStall);
        themePark.addAttraction(rollerCoaster);
        themePark.addAttraction(dodgems);
        assertEquals(4, themePark.countTotalCollection());
    }

    @Test
    public void canReviewAttractions(){
        themePark.addAttraction(playground);
        themePark.addStalls(iceCreamStall);
        themePark.addAttraction(rollerCoaster);
        themePark.addAttraction(dodgems);
        assertEquals(4, themePark.getAlReviewed().size());
    }



}
