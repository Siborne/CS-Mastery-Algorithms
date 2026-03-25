package Day98;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		double a = reader.nextDouble();
		double b = reader.nextDouble();
		double k = reader.nextDouble();

		double skill4 = 500;
		b *= 1.2;

		double skill1 = a + 0.9 * b;
		b *= 1.2;

		double skill2 = a;
		b *= 1.2;
		skill2 += a + 2 * b;
		b *= 1.2;

		double skill3 = 0;
		for (int i = 0; i < 4; i++) {
			skill3 += a + 5 * b;
			b *= 1.2;
		}
		if (skill1 + skill2 + skill3 + skill4 >= k) {
			System.out.println("You have slain an enemy");
		} else {
			System.out.println("You have been slain");
		}
		reader.close();
	}

}
