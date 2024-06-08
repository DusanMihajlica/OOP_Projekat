package geometry;

import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.JOptionPane;

public class DrawningPanel extends JPanel {

	private String unos;
	private Object shape = new Object();

	public DrawningPanel() {

		unos = JOptionPane.showInputDialog("Unesite oblik (Tacka ili Linija):");
		if ("Tacka".equals(unos)) {
			int x = Integer.parseInt(JOptionPane.showInputDialog("Unesite X koordinatu:"));
			int y = Integer.parseInt(JOptionPane.showInputDialog("Unesite Y koordinatu:"));
			shape = new Point(x, y, true);
		}
		if ("Linija".equals(unos)) {
			int x1 = Integer.parseInt(JOptionPane.showInputDialog("Unesite X koordinatu prve tacke:"));
			int y1 = Integer.parseInt(JOptionPane.showInputDialog("Unesite Y koordinatu prve tacke:"));
			int x2 = Integer.parseInt(JOptionPane.showInputDialog("Unesite X koordinatu druge tacke:"));
			int y2 = Integer.parseInt(JOptionPane.showInputDialog("Unesite Y koordinatu druge tacke:"));
			shape = new Line(new Point(x1, y1), new Point(x2, y2));
		}
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		if (shape != null) {
			if ((shape instanceof Point)) {
				Point p = (Point) shape;
				p.draw(g);
				movePoint(p);
			} else if (shape instanceof Line && "Linija".equals(unos)) {
				Line l = (Line) shape;
				l.draw(g);
			}
		}
	}


	private void movePoint(Point point) {
		String moveChoice = JOptionPane.showInputDialog("Unesite 'moveTo' ili 'moveBy' za pomeranje tačke:");
		if ("moveTo".equals(moveChoice)) {
			int x = Integer.parseInt(JOptionPane.showInputDialog("Unesite novu X koordinatu:"));
			int y = Integer.parseInt(JOptionPane.showInputDialog("Unesite novu Y koordinatu:"));
			point.moveTo(x, y);
		} else if ("moveBy".equals(moveChoice)) {
			int dx = Integer.parseInt(JOptionPane.showInputDialog("Unesite pomeraj za X osu:"));
			int dy = Integer.parseInt(JOptionPane.showInputDialog("Unesite pomeraj za Y osu:"));
			point.moveBy(dx, dy);
		}
		repaint();
	}

}
