package Day76;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		double c = reader.nextDouble();
		double h = reader.nextDouble();
		
		double r = (c*c+4*h*h)/(8*h);
		
		System.out.println(String.format("%.2f", r));
		reader.close();
	}
	
}
