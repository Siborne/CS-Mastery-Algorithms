package Day75;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		double a = reader.nextDouble();
		double b = reader.nextDouble();
		
		double c = a*b;
		double d = a/b;
		
		System.out.printf("%.6f*%.6f=%.6f\n",a,b,c);
		System.out.printf("%.6f/%.6f=%.6f",a,b,d);
		reader.close();
	}
	
}
