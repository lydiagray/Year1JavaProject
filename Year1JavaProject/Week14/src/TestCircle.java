
public class TestCircle {
	
	public static void main (String[] args) {
		Circle circle1 = new Circle(10);
		Circle circle2 = new Circle(20);
		
		System.out.println("Circle 1 perimeter is " + circle1.perimiter());
		System.out.println("Circle 1 area is " + circle1.area());
		
		System.out.println("Circle 2 perimeter is " + circle2.perimiter());
		System.out.println("Circle 2 area is " + circle2.area());
	}

}
