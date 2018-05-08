import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TeaCupRideTest {

    TeaCupRide teaCupRide;

    @Before
    public void before(){
        teaCupRide = new TeaCupRide(5, 6, (int) 0.6);
    }

    @Test
    public void getPrice(){
        assertEquals(5, teaCupRide.getPrice());
    }

    @Test
    public void getminAge(){
        assertEquals(6, teaCupRide.getMinAge());
    }

    @Test
    public void getHeight(){
        assertEquals(0.6, teaCupRide.getHeight(),0.1);
    }
}
