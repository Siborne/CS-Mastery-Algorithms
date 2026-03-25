package Day113;

import java.util.Scanner;

public class Demo7 {

	private static final int MOD = 11;

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		String line = reader.nextLine();
		String[] strs = line.split("-");
		int k = 1;
		int sum = 0;
		for (int i = 0; i < strs.length - 1; i++) {
			char[] chs = strs[i].toCharArray();
			for (char c : chs) {
				sum += (c - '0') * k;
				k++;
			}
		}
		int ans = sum % MOD;
		if (ans == 10) {
			ans = 'X' - '0';
		}
		int target = strs[3].charAt(0) - '0';
		if (ans == target) {
			System.out.println("Right");
		} else {
			StringBuilder sb = new StringBuilder();
			for (String str : strs) {
				sb.append(str).append("-");
			}
			sb = sb.delete(sb.length() - 2, sb.length());
			if (ans == 'X' - '0') {
				sb.append("X");
			} else {
				sb.append(ans);
			}
			System.out.println(sb.toString());
		}
		reader.close();
	}

}
