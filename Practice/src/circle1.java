import java.util.Scanner;

public class circle1 {
	public static void main(String[] args) {
	
		double radius;
		String msg = "Review method";
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter radius: ");
		radius = keyboard.nextDouble();
		
		//calculateArea(radius);
		//calculateCircumference(msg,radius);
		
		double area = calArea(radius);
		System.out.println("area = " + area);
		System.out.println("area = " + calArea(radius));
		
	}	
	
	public static double calArea(double radius) {
		double area;
		area = Math.PI * radius * radius;
		
		return area;
	}


public static void calculateArea(double radius) {
	//double radius = 10;
	double area;
	area = Math.PI * radius * radius;
	
	System.out.println("Radius: " + radius);
	System.out.println("Area of circle: " + area);
}

public static void calculateCircumference(String m, double radius) {
	//double radius = 10;
	double circumference;
	circumference = Math.PI * radius * 2;
	
	System.out.println("Radius: " + radius);
	System.out.println(m);
	System.out.println("Circumference of circle: " + circumference);
}

}