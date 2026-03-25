package Day129;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int cnt = 0;
		for (int i = 1; i <= 202504; i++) {
			if (is5(i)) {
				cnt++;
			}
		}
		System.out.println(cnt);
		reader.close();
	}

	private static boolean is5(int x) {
		int sum = 0;
		while (x != 0) {
			sum += x % 10;
			x /= 10;
		}

		return sum % 5 == 0;
	}

}
