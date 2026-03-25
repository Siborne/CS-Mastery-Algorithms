package Day84;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		double a = reader.nextDouble();
		double b = reader.nextDouble();
		double c = reader.nextDouble();
		double ans = 2*(a*b+a*c+b*c);
		
		System.out.println(String.format("%.6f", ans));
		
		reader.close();
	}
	
}
