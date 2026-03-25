package Day75;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		double a = reader.nextDouble();
		double b = reader.nextDouble();
		double c = reader.nextDouble();
		double d = a+b+c;
		double e = d/3;
		System.out.printf("%.6f\n%.6f",d,e);
		
		reader.close();
	}
	
}
