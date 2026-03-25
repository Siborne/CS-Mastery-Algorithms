package Day84;

import java.util.Scanner;

public class Demo31 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		double a = reader.nextDouble();
		double b = reader.nextDouble();
		double c = reader.nextDouble();
		System.out.println(String.format("%.6f", a * b * c));

		reader.close();
	}

}
