package geometrija;

public class Donut extends Circle {
	
public Donut(Point center, int radius) {
		super(center, radius);

	}

private int innerRadius;

public int getInnerRadius() {
return this.innerRadius;
}

public void setInnerRadius(int innerRadius) {
this.innerRadius = innerRadius;
}
}
