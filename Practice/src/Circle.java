

public class Circle {
	double radius;
	double diameter;
	double area;
	
	public Circle() {
		radius = 1;
		diameter = 2 * radius;
		area = Math.PI * radius * radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
		this.diameter = 2 * radius;
		this.area = Math.PI * radius * radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public double getDiameter() {
		return this.diameter;
	}
	
	public double getArea() {
		return this.area;
	}
	
}
