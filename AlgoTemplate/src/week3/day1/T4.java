package week3.day1;

import java.util.Scanner;

public class T4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int k = reader.nextInt();

		reader.nextLine();
		String line = reader.nextLine();

		StringBuilder sb = new StringBuilder(n);
		int[] cnt = new int[n];
		for (int i = 0; i < n; i++) {
			char c = line.charAt(i);
			int pos = sb.length();
			if (pos > 0 && c == sb.charAt(pos - 1)) {
				cnt[pos] = cnt[pos - 1] + 1;
			} else {
				cnt[pos] = 1;
			}
			sb.append(c);

			if (c == ')' && cnt[pos] == k) {
				int leftPos = pos - k;
				if (leftPos >= 0 && sb.charAt(leftPos) == '(' && cnt[leftPos] >= k) {
					sb.setLength(pos + 1 - 2 * k);
				}
			}
		}
		System.out.println(sb.toString());
		reader.close();
	}

}
