package geometry;

import static org.junit.Assert.*;
import org.junit.Test;

public class RectangleTest {
    @Test
    public void testUpperLeftPoint() {
        Point upperLeftPoint = new Point(10, 10);
        Rectangle test = new Rectangle(upperLeftPoint, 5, 10);
        assertEquals(test.getUpperLeftPoint(), upperLeftPoint);
    }

    @Test
    public void testWidth() {
        Point upperLeftPoint = new Point(10, 10);
        Rectangle test = new Rectangle(upperLeftPoint, 5, 10);
        assertEquals(test.getWidth(), 5);
    }

    @Test
    public void testHeight() {
        Point upperLeftPoint = new Point(10, 10);
        Rectangle test = new Rectangle(upperLeftPoint, 5, 10);
        assertEquals(test.getHeight(), 10);
    }

    @Test
    public void testUpperSelectable() {
        Point upperLeftPoint = new Point(10, 10);
        Rectangle test = new Rectangle(upperLeftPoint, 5, 10, true);
        assertTrue(test.isSelectable());
    }

    @Test
    public void testMoveTo(){
        Point upperLeftPoint = new Point(10, 10);
        Rectangle test = new Rectangle(upperLeftPoint, 10, 10);

        Point upperLeftPoint1 = new Point(20, 20);
        Rectangle test1 = new Rectangle(upperLeftPoint1, 10, 10);

        test.moveTo(20, 20);

        assertEquals(test.getUpperLeftPoint().getX(), test1.getUpperLeftPoint().getX());
        assertEquals(test.getUpperLeftPoint().getY(), test1.getUpperLeftPoint().getY());
        assertEquals(test.getHeight(), test1.getHeight());
        assertEquals(test.getWidth(), test1.getWidth());
        assertEquals(test.isSelectable(), test1.isSelectable());
    }

    @Test
    public void testMoveBy(){
        Point upperLeftPoint = new Point(10, 10);
        Rectangle test = new Rectangle(upperLeftPoint, 10, 10);

        Point upperLeftPoint1 = new Point(20, 20);
        Rectangle test1 = new Rectangle(upperLeftPoint1, 10, 10);

        test.moveBy(10, 10);

        assertEquals(test.getUpperLeftPoint().getX(), test1.getUpperLeftPoint().getX());
        assertEquals(test.getUpperLeftPoint().getY(), test1.getUpperLeftPoint().getY());
        assertEquals(test.getHeight(), test1.getHeight());
        assertEquals(test.getWidth(), test1.getWidth());
        assertEquals(test.isSelectable(), test1.isSelectable());
    }

    @Test
    public void testInstaceOfShape() {
        assertTrue(Shape.class.isAssignableFrom(Rectangle.class));
        assertFalse(Rectangle.class.isAssignableFrom(Shape.class));
    }

	@Test
    public void testPrazanKonstruktor() {
        Rectangle test = new Rectangle();
        assertNotEquals(test, null);
    }
}
