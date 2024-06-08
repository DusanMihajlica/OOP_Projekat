package geometry;

import java.awt.Graphics;

public class Point extends Shape {
	
	 	private int x;
	 	private int y;
	    private boolean selectable;

	    public Point(){
	        this.x=5;
	        this.y=5;
	        this.selectable=false;
	    }
	    public Point(int x, int y) {
	        this.x = x;
	        this.y = y;
	    }
	    public Point(int x, int y, boolean selectable) {
	        this.x = x;
	        this.y = y;
	        this.selectable=selectable;
	    }


	    public void setSelectable(boolean selectable){
	        this.selectable=selectable;
	    }
	    public void SetX(int x){
	        this.x=x;
	    }
	    public void SetY(int y){
	        this.y=y;
	    }
	    public int getX() {
	        return this.x;
	    }

	    public int getY() {
	        return this.y;
	    }
	    public boolean isSelectable()
	    {
	        return this.selectable;
	    }


	    public double rastojanje(int x, int y){
	        int X =  x;
	        int Y =  y;
	        return Math.sqrt((X-getX())*(X-getX()) + (Y-getY())*(Y-getY()));
	    }


	    public String toString(){
	        return "(" +this.x + "," +this.y + "," +this.selectable + ")";
	    }
	    public boolean equalse(Point tacka){
	        if(this.x == tacka.getX() && this.y == tacka.getY() && this.selectable ==tacka.isSelectable())
	        {
	            return true;
	        }
	        else{
	            return false;
	        }
	    }
	    
	    @Override
	    public void moveTo(int x, int y) {
	        this.x =x;
	        this.y =y;
	    }
	    @Override
	    public void moveBy(int byX, int byY) {
	        this.x = this.x +byX;
	        this.y = this.y + byY;
	    }
	    public double comapreTo(Point point1) {
	        return Math.abs(this.rastojanje(0, 0) - point1.rastojanje(0, 0));
	    }

		public boolean contains(int x, int y) {
	        if(this.rastojanje(x, y)<=2)
	        {
	            return true;
	        }
	        else{
	            return false;
	        }
		}
		@Override
		public void draw(Graphics g) {
			g.drawLine(this.x, this.y, this.x, this.y);
			if(selected)
				g.drawRect(this.x-3, this.y-3, 6, 6);
			
		}

}
