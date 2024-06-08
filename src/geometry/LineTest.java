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

}
