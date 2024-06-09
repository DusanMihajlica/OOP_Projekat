package geometry;

import static org.junit.Assert.*;

import org.junit.Test;

public class LineTest {

	@Test
	public void testStartPoint() {
		Point startPoint = new Point(5,6);
		Point endPoint = new Point(10,6);
		Line test = new Line(startPoint, endPoint);
		assertEquals(test.getStartPoint(), startPoint);
	}
	
	@Test
	public void testEndPoint() {
		Point startPoint = new Point(5,6);
		Point endPoint = new Point(10,6);
		Line test = new Line(startPoint, endPoint);
		assertEquals(test.getEndPoint(), endPoint);
	}
	
	@Test
	public void testSelectable() {
		Point startPoint = new Point(5,6);
		Point endPoint = new Point(10,6);
		Line test = new Line(startPoint, endPoint, true);
		assertEquals(test.isSelected(), true);
	}

	@Test
	public void testMoveTo(){
		Point startPoint1 = new Point(5,6);
		Point endPoint1 = new Point(10,6);
		Line test1 = new Line(startPoint1, endPoint1, true);

		Point startPoint = new Point(10,10);
		Point endPoint = new Point(10,20);
		Line test = new Line(startPoint, endPoint, true);

		test1.moveTo(10, 10, 10, 20);

		assertEquals(test.getEndPoint().getX(), test1.getEndPoint().getX());
		assertEquals(test.getEndPoint().getY(), test1.getEndPoint().getY());
		assertEquals(test.getStartPoint().getX(), test1.getStartPoint().getX());
		assertEquals(test.getStartPoint().getY(), test1.getStartPoint().getY());
		assertEquals(test.isSelected(), test1.isSelected());
	}

	@Test
	public void testMoveBy(){
		Point startPoint1 = new Point(5,6);
		Point endPoint1 = new Point(10,6);
		Line test1 = new Line(startPoint1, endPoint1, true);

		Point startPoint = new Point(10,10);
		Point endPoint = new Point(10,20);
		Line test = new Line(startPoint, endPoint, true);

		test1.moveBy(5, 4, 0, 14);

		assertEquals(test.getEndPoint().getX(), test1.getEndPoint().getX());
		assertEquals(test.getEndPoint().getY(), test1.getEndPoint().getY());
		assertEquals(test.getStartPoint().getX(), test1.getStartPoint().getX());
		assertEquals(test.getStartPoint().getY(), test1.getStartPoint().getY());
		assertEquals(test.isSelected(), test1.isSelected());
	}

	@Test
    public void testInstaceOfShape() {
        assertTrue(Shape.class.isAssignableFrom(Line.class));
        assertFalse(Line.class.isAssignableFrom(Shape.class));
    }

	@Test
    public void testPrazanKonstruktor() {
        Line test = new Line();
        assertNotEquals(test, null);
    }

}
