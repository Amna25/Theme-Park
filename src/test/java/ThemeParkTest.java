import attractions.Attraction;
import attractions.Dodgems;
import attractions.Playground;
import attractions.RollerCoaster;
import behaviours.IReviewed;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.IceCreamStall;
import stalls.ParkingSpot;

import static junit.framework.TestCase.assertEquals;

public class ThemeParkTest {
    ThemePark themePark;
    Dodgems dodgems;
    Playground playground;
    RollerCoaster rollerCoaster;
    IceCreamStall iceCreamStall;
    Visitor visitor, visitor1;


    @Before
    public void before(){
        themePark = new ThemePark();
        dodgems = new Dodgems("Bumber Cars", 5);
        playground = new Playground("MorningSide Park", 5);
        rollerCoaster = new RollerCoaster("Big Dipper", 3);
        iceCreamStall = new IceCreamStall("Over HIll","Mike", ParkingSpot.A1);
        visitor = new Visitor(25,100, 600);
        visitor1 = new Visitor(37,150,500);
        themePark.addAttraction(playground);
        themePark.addStalls(iceCreamStall);
        themePark.addAttraction(rollerCoaster);
        themePark.addAttraction(dodgems);
    }

    @Test
    public void canStoreAttractions(){
        assertEquals(4, themePark.countTotalCollection());
    }

    @Test
    public void canReviewAttractions(){
        assertEquals(4, themePark.getAlReviewed().size());
    }

    @Test
    public void canVisit(){
        themePark.visit(visitor1, rollerCoaster);
        assertEquals(1,rollerCoaster.getVisitCount());
        assertEquals(1,visitor.getVisitedAttractions().size());

    }



}
