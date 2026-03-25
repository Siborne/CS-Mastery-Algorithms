package Day84;

import java.util.Scanner;

public class Demo22 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		double p = reader.nextDouble();
		double R = reader.nextDouble();
		double n = reader.nextDouble();
		double r = R / (12 * 100.0);
		double EMI = p * r * (Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);
		System.out.printf("%.1f", EMI);

		reader.close();
	}

}
