package Domain;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConeTest {

    private Cone cone;

    @BeforeClass
    public void setup() throws Exception {
        cone = new Cone(3, 4);
    }

    @Test
    public void calculateVolume() throws Exception {
        assertEquals(37.69911, cone.calculateVolume(), 0.00001);
    }

    @Test
    public void calculateVolume_one() throws Exception {
        cone.setRadius(5.78);
        cone.setHeight(6.65);
        assertEquals(232.65154, cone.calculateVolume(), 0.00001);
    }

    @Test
    public void calculateVolume_two() throws Exception {
        cone.setRadius(7.14587);
        cone.setHeight(12.96587);
        assertEquals(693.33082, cone.calculateVolume(), 0.00001);
    }

}
