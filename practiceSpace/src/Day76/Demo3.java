package Day76;

import java.util.Scanner;

public class Demo3 {

	private static final double PI = 3.1415926;

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		double r = reader.nextDouble();
		double O = reader.nextDouble();

		double a = Math.toRadians(O);
		double x = r*Math.cos(a);
		double y = r*Math.sin(a);
		

		System.out.printf("%.2f,%.2f", x, y);

		reader.close();
	}

}
