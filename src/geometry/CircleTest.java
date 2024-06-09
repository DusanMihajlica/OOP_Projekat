package geometry;

import static org.junit.Assert.*;
import org.junit.Test;

public class CircleTest {

    @Test
    public void testCentr(){
        Point centr = new Point(10, 10);
        Circle test = new Circle(centr, 5);
        assertEquals(centr, test.getCenter());
    }

    @Test
    public void testHalfRadius(){
        Point centr = new Point(10, 10);
        Circle test = new Circle(centr, 5);
        assertEquals(test.getHalfRadius(), 5);
    }

    @Test
    public void testSelectable(){
        Point centr = new Point(10, 10);
        Circle test = new Circle(centr, 5, true);
        assertTrue(test.isSelectable());
    }

    @Test
    public void testMoveTo(){
        Point centr = new Point(10, 10);
        Circle test = new Circle(centr, 5);

        Point centr1 = new Point(20, 20);
        Circle test1 = new Circle(centr1, 5);

        test.moveTo(20, 20);

        assertEquals(test.getCenter().getX(), test1.getCenter().getX());
        assertEquals(test.getCenter().getY(), test1.getCenter().getY());
        assertEquals(test.isSelectable(), test1.isSelectable());
    }

    @Test
    public void testMoveBy(){
        Point centr = new Point(10, 10);
        Circle test = new Circle(centr, 5);

        Point centr1 = new Point(20, 20);
        Circle test1 = new Circle(centr1, 5);

        test.moveBy(10, 10);

        assertEquals(test.getCenter().getX(), test1.getCenter().getX());
        assertEquals(test.getCenter().getY(), test1.getCenter().getY());
        assertEquals(test.isSelectable(), test1.isSelectable());
    }

    @Test
    public void testInstaceOfShape() {
        assertTrue(Shape.class.isAssignableFrom(Circle.class));
        assertFalse(Circle.class.isAssignableFrom(Shape.class));
    }

    @Test
    public void testPrazanKonstruktor() {
        Circle test = new Circle();
        assertNotEquals(test, null);
    }
}
