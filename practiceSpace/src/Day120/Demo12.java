package Day120;

import java.util.Scanner;

public class Demo12 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		reader.nextLine();
		String s = reader.nextLine();

		int len = s.length();
		char[] chs = s.toCharArray();
		reverseString(chs, 0, len - 1);
		reverseString(chs, 0, n - 1);
		reverseString(chs, n, len - 1);

		System.out.println(chs);
		reader.close();
	}

	private static void reverseString(char[] ch, int start, int end) {
		while (start < end) {
			ch[start] ^= ch[end];
			ch[end] ^= ch[start];
			ch[start++] ^= ch[end--];
		}
	}

}
