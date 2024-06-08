package geometry;

import java.awt.Graphics;

public class Line extends Shape {
	
	private Point startPoint;
	private Point endPoint;
	private boolean selected;
	
	
	
	public Line() {}
	public Line(Point startPoint, Point endPoint) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}
	public Line(Point startPoint, Point endPoint, boolean selected) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
		this.selected = selected;
	}

	public Point getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}

	public Point getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	

	@Override
	public void moveTo(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveBy(int byX, int byY) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void draw(Graphics g) {
		g.drawLine(this.getStartPoint().getX(), this.getStartPoint().getY(), this.getEndPoint().getX(), this.getEndPoint().getY());
		
	}


}
