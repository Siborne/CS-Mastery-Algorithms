package Day75;

import java.util.Scanner;

public class Demo32 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		double a = reader.nextDouble();
		double b = reader.nextDouble();
		double c = reader.nextDouble();
		System.out.printf("%.2f",0.5*(a+b)*c);
		
		reader.close();
	}
	
}
