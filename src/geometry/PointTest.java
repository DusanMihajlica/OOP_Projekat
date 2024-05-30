package geometry;

import static org.junit.Assert.*;

import org.junit.Test;

public class PointTest {

    @Test
    public void test() {
        Point test = new Point(6, 7);
        assertEquals(test.getX(), 6);
        assertEquals(test.getY(), 7);
    }
    @Test
    public void testBoolean() {
        Point test = new Point(6, 7, true);
        assertTrue(test.isSelectable());
    }
    @Test
    public void testSeter() {
        Point test = new Point();
        test.SetX(6);
        test.SetY(8);
        assertEquals(test.getX(), 6);
        assertEquals(test.getY(), 8);
    }
    @Test
    public void testPrazanKonstruktor() {
        Point test = new Point();
        assertNotEquals(test, null);
    }
    @Test
    public void testSelectable() {
        Point test = new Point(6,5,true);
        assertTrue(test.isSelectable());
        test.setSelectable(false);
        assertTrue(!test.isSelectable());
    }
    @Test
    public void testDeafult() {
        Point test = new Point();
        assertEquals(test.getX(), 5);
        assertEquals(test.getY(), 5);
        assertFalse(test.isSelectable());
    }
    @Test
    public void testMetodaRastojanja() {
        Point test = new Point(5, 5);
        assertTrue(test.rastojanje(2, 5) == 3);
    }
    @Test
    public void testPripadanja() {
        Point test = new Point(5, 5);
        assertTrue(test.contains(5,6));
    }
    @Test
    public void testToString() {
        Point test = new Point(5, 6, false);
        String test1 = "(5,6,false)";
        assertEquals(test.toString(), test1);
    }
    @Test
    public void testEqualse() {
        Point test = new Point(5, 6, false);
        Point test1 = new Point(5, 6, false);
        assertTrue(test.equalse(test1));
    }
    @Test
    public void testInstaceOfShape() {
        assertTrue(Shape.class.isAssignableFrom(Point.class));
        assertFalse(Point.class.isAssignableFrom(Shape.class));
    }
    @Test
    public void testMoveTo() {
        Point test = new Point(2, 3);
        Point test1 = new Point(5, 6);
        test.moveTo(5, 6);
        assertTrue(test.equalse(test1));
    }
    @Test
    public void testMoveBy() {
        Point test = new Point(2, 3);
        Point test1 = new Point(5, 6);
        test.moveBy(3, 3);
        assertTrue(test.equalse(test1));
    }
	@Test
    public void testCompareTo() {
        Point test = new Point(3, 4);
        Point test1 = new Point(3, 4);
        assertTrue(test.comapreTo(test1) == 0);
    }
}
