package geometry;

import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawningPanel extends JPanel {
	
	
	private Object[] shapes = new Object[10];
	public DrawningPanel() {
		
		shapes[0] = new Point(80, 100, true);
		shapes[1] = new Line(new Point(200, 80), new Point(250, 180));
	}
	public void paint(Graphics g) {
		super.paint(g);
		for(int i = 0; i<shapes.length; i++) {
			Object obj = shapes[i];
			if(obj != null) {
				if(obj instanceof Point) {
					Point p = (Point) obj;
					p.draw(g);
				}
				else if(obj instanceof Line) {
					Line l = (Line) obj;
					l.draw(g);
				}
			}
		}
	}
	

}
