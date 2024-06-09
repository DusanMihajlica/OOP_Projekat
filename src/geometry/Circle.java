package geometry;

import java.awt.Graphics;
public class Circle  extends Shape{

    private Point center;
    private int halfRadius;
    private boolean selectable;


    public Circle(){

    }
    public Circle(Point centr, int halfRadius){
        this.center = centr;
        this.halfRadius = halfRadius;
    }
    public Circle(Point centr, int halfRadius, boolean selectable){
        this.center = centr;
        this.halfRadius = halfRadius;
        this.selectable = selectable;
    }

    public Point getCenter(){
        return this.center;
    }
    public int getHalfRadius(){
        return this.halfRadius;
    }
    public boolean isSelectable(){
        return this.selectable;
    }
    public void setCentr(Point centr){
        this.center = centr;
    }
    public void setHalfRadius(int halfRadius){
        this.halfRadius = halfRadius;
    }
    public void setSelectable(boolean selectable){
        this.selectable = selectable;
    }



    @Override
    public void moveTo(int x, int y) {
        this.center.moveTo(x, y);
    }

    @Override
    public void moveBy(int byX, int byY) {
        this.center.moveBy(byX, byY);
    }

    @Override
    public void draw(Graphics g) {
        g.drawOval(this.center.getX(), this.center.getY(), this.halfRadius, this.halfRadius);
    }
    
}
