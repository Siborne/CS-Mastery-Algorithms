package global;

import java.util.Scanner;

public class T3 {

	private static int[] digits = new int[26];

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		char[] chs = reader.nextLine().toCharArray();
		for (char c : chs) {
			digits[c - 'a']++;
		}
		boolean flag = true;
		for (int digit : digits) {
			if ((digit & 1) == 1) {
				flag = false;
			}
		}
		System.out.println(flag ? "YES" : "NO");
		reader.close();
	}

}
