package Day75;

import java.util.Scanner;

public class Demo30 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		double d = reader.nextDouble();
		double h = reader.nextDouble();
		
		System.out.printf("%.6f",d*h);
		
		reader.close();
	}
	
}
