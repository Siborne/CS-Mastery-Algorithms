package Day76;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		double r = reader.nextDouble();
		double a = reader.nextDouble();
		double l = 0.01745 * r * a;
		System.out.println(String.format("%.2f", l));

		reader.close();
	}

}
