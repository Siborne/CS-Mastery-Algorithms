package Day123;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		while (reader.hasNextDouble()) {
			double ans = Math.abs(reader.nextDouble());
			System.out.println(String.format("%.2f", ans));
		}

		reader.close();
	}

}
