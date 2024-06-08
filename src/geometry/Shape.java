package geometry;

import java.awt.Graphics;

public abstract class Shape implements Movable {
	
	protected boolean selected;
	public abstract void draw(Graphics g);

}
