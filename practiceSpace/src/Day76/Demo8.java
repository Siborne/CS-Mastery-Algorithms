package Day76;

import java.util.Scanner;

public class Demo8 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		double r = reader.nextDouble();
		double c = reader.nextDouble();
		
		double h = r-0.5*Math.sqrt(4*r*r-c*c);
		
		System.out.println(String.format("%.2f", h));
		
		reader.close();
	}
	
}
