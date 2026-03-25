package Day75;

import java.util.Scanner;

public class Demo25 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		double a = reader.nextDouble();
		System.out.printf("%.6f",Math.abs(a));
		
		reader.close();
	}
	
}
