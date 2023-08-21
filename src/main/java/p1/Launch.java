//Factory Method

package p1;

import java.util.Scanner;

interface Shape {
	void disp();
}

class Square implements Shape {

	@Override
	public void disp() {
		System.out.println("Hi from Square");
	}
}

class Circle implements Shape {

	@Override
	public void disp() {
		System.err.println("Hi from Circle");
	}
}

class Rectangle implements Shape {

	@Override
	public void disp() {
		System.out.println("Hi from Rectangle");
	}
}

class GenerationClass {
	public Shape generateShapes(String shape) {
		if (shape.equalsIgnoreCase("Square")) {
			return new Square();
		} else if (shape.equalsIgnoreCase("Circle")) {
			return new Circle();
		} else if (shape.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		} else {
			return null;
		}
	}
}

public class Launch {
	public static void main(String[] args) {
		try {
			GenerationClass gc = new GenerationClass();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Shape: ");
			String shape = sc.next();
			Shape s1 = gc.generateShapes(shape);
			s1.disp();

			System.out.println("Enter the Shape: ");
			shape = sc.next();
			Shape s2 = gc.generateShapes(shape);
			s2.disp();

			System.out.println("Enter the Shape: ");
			shape = sc.next();
			Shape s3 = gc.generateShapes(shape);
			s3.disp();
		} catch (NullPointerException e) {
			System.out.println("Specified Object cannot be instantiated");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
