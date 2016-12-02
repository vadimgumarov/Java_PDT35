package examples.sandbox;

public class MyFirstProgram {

	public static void main(String[] args) {

		hello("World");
		hello("Vadim");
		hello("User");

		double l = 5;
		area(4);
		System.out.println("Area of a square with side " + l + " = " + area(l));

		double a = 4;
		double b = 6;
		System.out.println("Area of a rectangular with sides " + a + " and " + b + " = " + area(a, b));


	}


	public static void hello(String user) {

		System.out.println("Hello, " + user + "!");

	}

	public static double area(double len) {
		return len * len;

	}


	public static double area(double a, double b){
		return a * b;
	}
}

