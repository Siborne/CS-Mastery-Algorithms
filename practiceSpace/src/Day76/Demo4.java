package Day76;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		double r = reader.nextDouble();
		double h = reader.nextDouble();
		
		double c = 2*Math.sqrt(h*(2*r-h));
		
		System.out.println(String.format("%.2f", c));
		
		reader.close();
	}
	
}
