package geometry;

import java.awt.Graphics;

public class Point extends Shape {
	
	 	private int x;
	 	private int y;
	    private boolean selectable;

	    public Point(){
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

		@Override
		public void draw(Graphics g) {
			g.drawLine(this.x, this.y, this.x, this.y);
			if(selected)
				g.drawRect(this.x-3, this.y-3, 6, 6);
			
		}

}
