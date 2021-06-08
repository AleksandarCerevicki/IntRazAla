package geometrija;

public class Circle extends Shape {
  protected Point center;
  protected int radius;
  
  public Circle(Point center, int radius) {
  super();
  this.center = center;
  this.radius = radius;
}
  
public Circle(Point center, int radius, boolean selected) {
  super(selected);
  this.center = center;
  this.radius = radius;
}
} 
