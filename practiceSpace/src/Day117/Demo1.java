package Day117;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		char[] chs = reader.nextLine().toCharArray();

		int targetDigit = getDigit(chs[0]);
		char ch = chs[1];

		boolean flag = false;

		for (int i = 0; i < 5; i++) {
			chs = reader.next().toCharArray();
			int digit = getDigit(chs[0]);
			char c = chs[1];
			if (digit == targetDigit) {
				flag = true;
			}
			if (ch == c) {
				flag = true;
			}
		}

		System.out.println(flag ? "YES" : "NO");
		reader.close();
	}

	private static int getDigit(char c) {
		if (c == 'T') {
			return 10;
		} else if (c == 'J') {
			return 11;
		} else if (c == 'Q') {
			return 12;
		} else if (c == 'K') {
			return 13;
		} else if (c == 'A') {
			return 14;
		} else if (c == '2') {
			return 15;
		} else {
			return c - '0';
		}
	}

}
