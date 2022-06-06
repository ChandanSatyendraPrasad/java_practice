package chandan.satyendra.prasad;

import java.util.Scanner;

public class CalculateAreaofTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter A side of Triangle: ");
		String a = sc.next();
		System.out.println("A side of Triangle: " + a);
		System.out.print("Please, enter B side of Triangle: ");
		String b = sc.next();
		System.out.println("B side of Triangle:" + b);
		System.out.print("Please, enter C side of Triangle: ");
		String c = sc.next();
		System.out.println("C side of Triangle:" + c);
		int p=0;
		p=Integer.parseInt(a)+Integer.parseInt(b)+Integer.parseInt(c);
		p=p/2;
		System.out.println("Triangle perimeter is: " + p);
		int triangleArea=p*(p-Integer.parseInt(a))*(p-Integer.parseInt(b))*(p-Integer.parseInt(c));
		triangleArea=(int) Math.sqrt(triangleArea);
		System.out.println("Triangle area is: " + triangleArea);
	}

}
