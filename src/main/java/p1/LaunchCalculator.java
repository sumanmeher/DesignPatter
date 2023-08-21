//Singleton Pattern

package p1;

import java.util.Scanner;

class Calculator{
	void disp() {
		
	}
}
public class LaunchCalculator {
	static Calculator c2;
	static Calculator c1 = new Calculator(); //during loading
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you wish to create calculator class?");
		boolean b=sc.nextBoolean();
		if(b==true) {
			c2=new Calculator(); //as per the need
		}else {
			System.out.println("Object not created");
		}
	}
}
