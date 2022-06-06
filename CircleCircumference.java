package chandan.satyendra.prasad;

import java.util.Scanner;

public class CircleCircumference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter circle radius: ");
		String a = sc.next();
		System.out.println("Radius of  circle: " + a);
		float pi=(float) 3.14;
		double circleCircumference=2*pi*Double.parseDouble(a);
		System.out.println("Circle circumference is: " + circleCircumference);
	}

}
