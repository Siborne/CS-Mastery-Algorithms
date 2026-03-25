package Day76;

import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		double r = reader.nextDouble();
		double l = reader.nextDouble();
		double a = 57.296*l/r;
		
		System.out.println(String.format("%.2f", a));
		
		reader.close();
	}
	
}
