package Day84;

import java.util.Scanner;

public class Demo29 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		double ans = f(9)/f(6);
		System.out.println(String.format("%.6f", ans));
		
		reader.close();
	}
	
	private static double f(int x) {
		return x*x;
	}
	
}
