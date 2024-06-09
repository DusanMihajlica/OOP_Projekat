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
	

	
	public void moveTo(int x1, int y1, int x2, int y2) {
		this.startPoint.SetX(x1);
		this.startPoint.SetY(y1);
		this.endPoint.SetX(x2);
		this.endPoint.SetY(y2);
	}

	public void moveBy(int byX1, int byY1, int byX2, int byY2) {
		this.startPoint.SetX(this.startPoint.getX() + byX1);
		this.startPoint.SetY(this.startPoint.getY() + byY1);
		this.endPoint.SetX(this.endPoint.getX() + byX2);
		this.endPoint.SetY(this.endPoint.getY() + byY2);
		
	}


	@Override
	public void draw(Graphics g) {
		g.drawLine(this.getStartPoint().getX(), this.getStartPoint().getY(), this.getEndPoint().getX(), this.getEndPoint().getY());
		
	}
	@Override
	public void moveTo(int x, int y) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'moveTo'");
	}
	@Override
	public void moveBy(int byX, int byY) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'moveBy'");
	}


}
