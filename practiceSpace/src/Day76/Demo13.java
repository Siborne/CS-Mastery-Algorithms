package Day76;

import java.util.Scanner;

public class Demo13 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		double a = reader.nextDouble();
		double ans = Math.pow(a, 2)*6;
		
		System.out.println(String.format("%.6f", ans));
		
		reader.close();
	}
	
}
