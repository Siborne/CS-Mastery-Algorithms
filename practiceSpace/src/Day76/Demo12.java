package Day76;

import java.util.Scanner;

public class Demo12 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		double a = reader.nextDouble();
		
		double ans = Math.pow(a, 3);
		
		System.out.println(String.format("%.6f", ans));
		
		reader.close();
	}
	
}
