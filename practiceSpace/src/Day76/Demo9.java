package Day76;

import java.util.Scanner;

public class Demo9 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		double r = reader.nextDouble();
		double c = reader.nextDouble();
		double h = reader.nextDouble();
		double l = reader.nextDouble();

		double f = 0.5 * (r * l - c * (r - h));
		System.out.println(String.format("%.3f", f));

		reader.close();
	}

}
