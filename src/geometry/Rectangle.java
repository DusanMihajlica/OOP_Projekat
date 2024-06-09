package geometry;

import java.awt.Graphics;

public class Rectangle extends Shape {
    
    private Point upperLeftPoint;
    private int width;
    private int height;
    private boolean selectable;

    public Rectangle(){

    }
    public Rectangle(Point upperLeftPoint, int width, int height){
        this.upperLeftPoint = upperLeftPoint;
        this.width = width;
        this.height = height;
    }
    public Rectangle(Point upperLeftPoint, int width, int height, boolean selectable){
        this.upperLeftPoint = upperLeftPoint;
        this.width = width;
        this.height = height;
        this.selectable = selectable;
    }

    public Point getUpperLeftPoint(){
        return this.upperLeftPoint;
    }
    public int getWidth(){
        return this.width;
    }
    public int getHeight(){
        return this.height;
    }
    public boolean isSelectable(){
        return this.selectable;
    }
    public void setUpperLeftPoint(Point upperLeftPoint){
        this.upperLeftPoint = upperLeftPoint;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public void setSelectable(boolean selectable){
        this.selectable = selectable;
    }

    @Override
    public void moveTo(int x, int y) {
        this.upperLeftPoint.moveTo(x, y);
    }
    @Override
    public void moveBy(int byX, int byY) {
        this.upperLeftPoint.moveBy(byX, byY);
    }
    @Override
    public void draw(Graphics g) {
        g.drawRect(this.upperLeftPoint.getX(), this.upperLeftPoint.getY(), this.width, this.height);
    }
}
