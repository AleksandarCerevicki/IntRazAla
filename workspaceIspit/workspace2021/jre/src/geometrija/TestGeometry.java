package geometrija;

import org.w3c.dom.css.Rect;

public class TestGeometry {

	public static void main(String[] args) {

		Rectangle rect1 = new Rectangle();

		rect1.setWidth(4);

		rect1.setHeigth(3);

		System.out.println(rect1.area());
		
		Line line1 = new Line();

		line1.setEndX(4);
		line1.setEndY(3);
		
		System.out.println(line1.length());
		
		Point point1 = new Point();
		point1.setX(1);
		point1.setY(6);
		
		Point point2 = new Point();
		point2.setX(4);
		point2.setY(10);
		
		System.out.println(point1.distance());
		
	}
}
