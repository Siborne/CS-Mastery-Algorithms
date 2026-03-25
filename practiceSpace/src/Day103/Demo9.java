package Day103;

import java.util.Scanner;

public class Demo9 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		double k = reader.nextDouble();
		double c = k - 273.15;
		double f = c * 1.8 + 32;
		System.out.println(f);

		reader.close();
	}

}
