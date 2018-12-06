package oop.example.example3;

public class Circle {
	/*fields*/
	private int radius;
	
	/*constructors*/
	public Circle() {
		this.radius = 1;
	}
	
	public Circle(int radius) {
		this.radius = radius;
	}

	/*methods*/
	public double getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double getCircleArea() {
		double area;
		area = (radius * radius * Math.PI);
		return area;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
}
