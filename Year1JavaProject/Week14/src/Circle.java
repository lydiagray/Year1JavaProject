import java.math.*;
public class Circle {
	
	private int radius;
	
	public Circle(int reqRadius) {
		radius = reqRadius;
	}
	
	public double perimiter() {
		return 2 * Math.PI * radius;
	}
	
	public double area() {
		return (Math.PI * radius) * (Math.PI * radius);
	}

}
