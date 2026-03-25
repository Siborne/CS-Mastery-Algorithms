package Day103;

import java.util.Scanner;

public class Demo16 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		char[] chs = reader.nextLine().toCharArray();
		StringBuilder sb = new StringBuilder();
		int[] digits = new int[10];
		for (char ch : chs) {
			digits[ch - '0']++;
		}
		for (int i = 1; i < 10; i++) {
			if (digits[i]-- != 0) {
				sb.append(i);
				break;
			}
		}
		for (int i = 0; i < digits.length; i++) {
			while (digits[i]-- > 0) {
				sb.append(i);
			}
		}
		System.out.println(sb.toString());
		reader.close();
	}

}
