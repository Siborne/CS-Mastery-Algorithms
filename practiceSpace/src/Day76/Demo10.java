package Day76;

import java.util.Scanner;

public class Demo10 {

	private static final double PI = 3.1415926;

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		double r = reader.nextDouble();
		double h = reader.nextDouble();

		double area = PI * r * (r + Math.sqrt(r * r + h * h));

		System.out.println("Surface area=" + String.format("%.2f", area));
		reader.close();
	}

}
