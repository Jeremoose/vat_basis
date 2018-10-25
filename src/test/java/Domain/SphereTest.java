package Domain;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SphereTest {

    private static Sphere sphere;

    @BeforeClass
    public static void setup() throws Exception {
        sphere = new Sphere(5.0);
    }


    @Test
    public void calculateVolume() throws Exception {
        assertEquals(523.59877, sphere.calculateVolume(), 0.00001);
    }

    @Test
    public void calculateVolume_one() throws Exception {
        sphere.setRadius(13.25);
        assertEquals(9743.9768643435, sphere.calculateVolume(), 0.00000001);
    }

    @Test
    public void calculateVolume_two() throws Exception {
        sphere.setRadius(25.6384);
        assertEquals(70592.955717374, sphere.calculateVolume(), 0.000000001);
    }

}