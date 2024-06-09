package geometry;

import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.JOptionPane;

public class DrawningPanel extends JPanel {

	private String unos;
	private Object shape = new Object();

	public DrawningPanel() {

		unos = JOptionPane.showInputDialog("Unesite oblik (Tacka, Linija, Krug, Pravougaonik):");
		if ("Tacka".equals(unos)) {
			int x = Integer.parseInt(JOptionPane.showInputDialog("Unesite X koordinatu:"));
			int y = Integer.parseInt(JOptionPane.showInputDialog("Unesite Y koordinatu:"));
			shape = new Point(x, y, true);
		}
		else if ("Linija".equals(unos)) {
			int x1 = Integer.parseInt(JOptionPane.showInputDialog("Unesite X koordinatu prve tacke:"));
			int y1 = Integer.parseInt(JOptionPane.showInputDialog("Unesite Y koordinatu prve tacke:"));
			int x2 = Integer.parseInt(JOptionPane.showInputDialog("Unesite X koordinatu druge tacke:"));
			int y2 = Integer.parseInt(JOptionPane.showInputDialog("Unesite Y koordinatu druge tacke:"));
			shape = new Line(new Point(x1, y1), new Point(x2, y2));
		}
		else if("Krug".equals(unos)){
			int x = Integer.parseInt(JOptionPane.showInputDialog("Unesite X koordinatu centra:"));
			int y = Integer.parseInt(JOptionPane.showInputDialog("Unesite Y koordinatu centra:"));
			int halfRadius = Integer.parseInt(JOptionPane.showInputDialog("Unesite poluprecnik kruga:"));
			shape = new Circle(new Point(x, y), halfRadius);
		}
		else if("Pravougaonik".equals(unos)){
			int x = Integer.parseInt(JOptionPane.showInputDialog("Unesite X koordinatu gornjeg levog temena:"));
			int y = Integer.parseInt(JOptionPane.showInputDialog("Unesite Y koordinatu gornjeg levog temena:"));
			int width = Integer.parseInt(JOptionPane.showInputDialog("Unesite sirinu pravougaonika:"));
			int height = Integer.parseInt(JOptionPane.showInputDialog("Unesite visinu pravougaonika:"));
			shape = new Rectangle(new Point(x, y), width, height);
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
			} else if (shape instanceof Line) {
				Line l = (Line) shape;
				l.draw(g);
				moveLine(l);
			} else if(shape instanceof Circle){
				Circle c = (Circle) shape;
				c.draw(g);
				String input = JOptionPane.showInputDialog("Kako zelite da promenite krug (velicina, pomeranje):");
				if("velicina".equals(input)){
					changeCircle(c);
				} else if("pomeranje".equals(input)){
					moveCircle(c);
				}
			} else if(shape instanceof Rectangle){
				Rectangle r = (Rectangle) shape;
				r.draw(g);
				String input = JOptionPane.showInputDialog("Sta zelite da radite sa pravougaonikom rotiranje(za 90 stepeni) pomeranje ili menjanje velicine(velicina):");
				if("rotiranje".equals(input)){
					rectRotate(r);
				}
				else if("pomeranje".equals(input)){
					moveRectangle(r);
				}
				else if("velicina".equals(input)){
					changeRect(r);
				}
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

	private void moveLine(Line line) {
		String moveChoice = JOptionPane.showInputDialog("Unesite 'moveTo' ili 'moveBy' za pomeranje linije:");
		if ("moveTo".equals(moveChoice)) {
			int x1 = Integer.parseInt(JOptionPane.showInputDialog("Unesite novu X koordinatu prve tacke:"));
			int y1 = Integer.parseInt(JOptionPane.showInputDialog("Unesite novu Y koordinatu prve tacke:"));
			int x2 = Integer.parseInt(JOptionPane.showInputDialog("Unesite novu X koordinatu druge tacke:"));
			int y2 = Integer.parseInt(JOptionPane.showInputDialog("Unesite novu Y koordinatu druge tacke:"));
			line.moveTo(x1, y1, x2, y2);
		} else if ("moveBy".equals(moveChoice)) {
			int dx1 = Integer.parseInt(JOptionPane.showInputDialog("Unesite pomeraj za X osu prve tacke:"));
			int dy1 = Integer.parseInt(JOptionPane.showInputDialog("Unesite pomeraj za Y osu prve tacke:"));
			int dx2 = Integer.parseInt(JOptionPane.showInputDialog("Unesite pomeraj za X osu druge tacke:"));
			int dy2 = Integer.parseInt(JOptionPane.showInputDialog("Unesite pomeraj za Y osu duge tacke:"));
			line.moveBy(dx1, dy1, dx2, dy2);
		}
		repaint();
	}

	private void moveCircle(Circle circle) {
		String moveChoice = JOptionPane.showInputDialog("Unesite 'moveTo' ili 'moveBy' za pomeranje kruga");
		if ("moveTo".equals(moveChoice)) {
			int x = Integer.parseInt(JOptionPane.showInputDialog("Unesite novu X koordinatu centra:"));
			int y = Integer.parseInt(JOptionPane.showInputDialog("Unesite novu Y koordinatu centra:"));
			circle.moveTo(x, y);
		} else if ("moveBy".equals(moveChoice)) {
			int dx = Integer.parseInt(JOptionPane.showInputDialog("Unesite pomeraj za X osu:"));
			int dy = Integer.parseInt(JOptionPane.showInputDialog("Unesite pomeraj za Y osu:"));
			circle.moveBy(dx, dy);
		}
		repaint();
	}

	private void changeCircle(Circle circle){
		int halfRadius = Integer.parseInt(JOptionPane.showInputDialog("Unesite novi poluprecnik kruga:"));
		circle.setHalfRadius(halfRadius);
		repaint();
	}

	private void moveRectangle(Rectangle rectangle) {
		String moveChoice = JOptionPane.showInputDialog("Unesite 'moveTo' ili 'moveBy' za pomeranje pravougaonika");
		if ("moveTo".equals(moveChoice)) {
			int x = Integer.parseInt(JOptionPane.showInputDialog("Unesite novu X koordinatu gornjeg levog temena:"));
			int y = Integer.parseInt(JOptionPane.showInputDialog("Unesite novu Y koordinatu gornjeg levog temena:"));
			rectangle.moveTo(x, y);
		} else if ("moveBy".equals(moveChoice)) {
			int dx = Integer.parseInt(JOptionPane.showInputDialog("Unesite pomeraj za X osu:"));
			int dy = Integer.parseInt(JOptionPane.showInputDialog("Unesite pomeraj za Y osu:"));
			rectangle.moveBy(dx, dy);
		}
		repaint();
	}

	private void changeRect(Rectangle rectangle){
		int width = Integer.parseInt(JOptionPane.showInputDialog("Unesite novu sirinu pravougaonika:"));
		int height = Integer.parseInt(JOptionPane.showInputDialog("Unesite novu visinu pravougaonika:"));
		rectangle.setWidth(width);
		rectangle.setHeight(height);
		repaint();
	}

	private void rectRotate(Rectangle rectangle){
		int height = rectangle.getWidth();
		int width = rectangle.getHeight();
		rectangle.setHeight(height);
		rectangle.setWidth(width);
		repaint();
	}
}
