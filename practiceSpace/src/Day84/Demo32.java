package Day84;

import java.util.Scanner;

public class Demo32 {

	private final static double PI = 3.14159;
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		double r = reader.nextDouble();
		double ans = (4.0/3)*PI*Math.pow(r, 3);
		System.out.println(String.format("%.6f", ans));
		
		reader.close();
	}
	
}
