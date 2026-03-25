package Day124;

import java.util.Scanner;

public class Demo15 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		if (n >= 90) {
			System.out.println("4.0");
		} else if (n >= 60) {
			int diff = 90 - n;
			double ans = 4.0 - diff * 0.1;
			System.out.println(String.format("%.1f", ans));
		} else {
			int score = (int) (Math.sqrt(n) * 10);
			if (score>=60) {
				int diff = 90 - score;
				double ans = 4.0 - diff * 0.1;
				System.out.println(String.format("%.1f", ans));
			}else {
				double ans = 0;
				System.out.println(String.format("%.1f", ans));
			}
		}

		reader.close();
	}

}
