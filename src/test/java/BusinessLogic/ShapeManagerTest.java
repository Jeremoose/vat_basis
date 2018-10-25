package BusinessLogic;

import Domain.*;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShapeManagerTest {

    private static ShapeManager shapeManager;
    private static Sphere sphere;
    private static Cylinder cylinder;
    private static Cone cone;
    private static RectangularPrism rectangularPrism;
    private static SquarePyramid squarePyramid;

    @BeforeClass
    public static void setup() throws Exception {
        shapeManager = new ShapeManager();
        sphere = new Sphere(5.0);
        cylinder = new Cylinder(5.0, 6.0);
        cone = new Cone(3, 4);
        rectangularPrism = new RectangularPrism(3.0, 4.0, 5.0);
        squarePyramid = new SquarePyramid(3.0, 2.0);

        shapeManager.add(sphere);
        shapeManager.add(cylinder);
        shapeManager.add(cone);
        shapeManager.add(rectangularPrism);
        shapeManager.add(squarePyramid);
    }

    @Test
    public void calculateTotalVolume_one() throws Exception {
        assertEquals(1098.53678, shapeManager.calculateTotalVolume(), 0.00001);
    }

    @Test
    public void calculateTotalVolume_two() throws Exception {
        sphere.setRadius(13.25);
        cylinder.setRadius(5.88);
        cylinder.setHeight(2.37);
        cone.setRadius(5.78);
        cone.setHeight(6.65);
        rectangularPrism.setLength(6.54);
        rectangularPrism.setWidth(8.69);
        rectangularPrism.setHeight(5.36);
        squarePyramid.setLength(17.45);
        squarePyramid.setHeight(8.65);

        assertEquals(11416.6596143, shapeManager.calculateTotalVolume(), 0.0001);
    }

    @Test
    public void calculateTotalVolume_three() throws Exception {
        sphere.setRadius(25.6384);
        cylinder.setRadius(17.6535);
        cylinder.setHeight(5.3645);
        cone.setRadius(7.14587);
        cone.setHeight(12.96587);
        rectangularPrism.setLength(12.79);
        rectangularPrism.setWidth(16.93);
        rectangularPrism.setHeight(3.45);
        squarePyramid.setLength(0.78);
        squarePyramid.setHeight(0.25);

        assertEquals(77285.5760274, shapeManager.calculateTotalVolume(), 0.0001);
    }

    @Test
    public void calculateTotalVolume() throws Exception {
        assertEquals(0.0, shapeManager.calculateTotalVolume(), 0.00001);
    }

}
