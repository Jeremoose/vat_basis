package Domain;


import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquarePyramidTest {
    private static SquarePyramid squarePyramid;

    @BeforeClass
    public static void setup() throws Exception {
        squarePyramid = new SquarePyramid(3.0, 2.0);
    }

    @Test
    public void calculateVolume() throws Exception {
        assertEquals(6.0, squarePyramid.calculateVolume(), 0.00001);
    }

    @Test
    public void calculateVolume_one() throws Exception {
        squarePyramid.setLength(17.45);
        squarePyramid.setHeight(8.65);
        assertEquals(877.98221, squarePyramid.calculateVolume(), 0.00001);
    }


    @Test
    public void calculateVolume_two() throws Exception {
        squarePyramid.setLength(0.78);
        squarePyramid.setHeight(0.25);
        assertEquals(0.0507, squarePyramid.calculateVolume(), 0.00001);
    }
}