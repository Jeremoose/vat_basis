package Domain;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CylinderTest {

    private static Cylinder cylinder;

    @BeforeClass
    public static void setup() throws Exception {
        cylinder = new Cylinder(5.0, 6.0);
    }

    @Test
    public void calculateVolume() throws Exception {
        assertEquals(471.23889, cylinder.calculateVolume(), 0.00001);
    }

    @Test
    public void calculateVolume_one() throws Exception {
        cylinder.setRadius(5.88);
        cylinder.setHeight(2.37);
        assertEquals(257.42627, cylinder.calculateVolume(), 0.00001);
    }

    @Test
    public void calculateVolume_two() throws Exception {
        cylinder.setRadius(17.6535);
        cylinder.setHeight(5.3645);
        assertEquals(5252.19408, cylinder.calculateVolume(), 0.00001);
    }

}
