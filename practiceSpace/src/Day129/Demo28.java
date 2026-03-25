package Day129;

import java.util.Scanner;

public class Demo28 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int s = reader.nextInt();
		for (int a = -999; a <= 999; a++) {
			if (a == 0) {
				continue;
			}
			int b = s - a;
			if (b == 0 || b > 999 || b < -999) {
				continue;
			}
			System.out.println(a + " " + b);
			 break;
		}

		reader.close();
	}

}
