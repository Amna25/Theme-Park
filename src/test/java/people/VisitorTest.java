package people;

import attractions.Attraction;
import attractions.Playground;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;
   ArrayList<Attraction>visitedAttraction;
   Playground playground;

    @Before
    public void before() {
        visitor = new Visitor(14, 1.2, 40.0);
        visitedAttraction = new ArrayList<Attraction>();
        playground = new Playground("Park",4);

    }

    @Test
    public void hasAge() {
        assertEquals(14, visitor.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(1.2, visitor.getHeight(), 0.1);
    }

    @Test
    public void hasMoney() {
        assertEquals(40.0, visitor.getMoney(), 0.1);
    }

    @Test
    public void canAddAttraction(){
        visitor.addAttraction(playground);
        assertEquals(1,visitor.getVisitedAttractions().size());
    }

}
