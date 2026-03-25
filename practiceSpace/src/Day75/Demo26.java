package Day75;

import java.util.Scanner;

public class Demo26 {

	private static final double PI = 3.1415926;
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		double r = reader.nextDouble();
		double area = PI*r*r;
		double circumference = 2*PI*r;
		System.out.printf("Area=%.6f\n",area);
		System.out.printf("Circumference=%.6f\n",circumference);		reader.close();
	}
	
}
