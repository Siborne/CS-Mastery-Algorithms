package global;

import java.util.Arrays;

public class T4 {

	private static boolean solve(int n) {
		boolean flag = false;
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				int[] digits = new int[26];
				Arrays.fill(digits, 0);
				for (char j : String.valueOf(n).toCharArray()) {
					digits[j - '0']++;
				}
				for (char j : String.valueOf(i).concat(String.valueOf(n / i)).toCharArray()) {
					digits[j - '0']--;
				}
				boolean flag2 = true;
				for (int j : digits) {
					if (j != 0) {
						flag2 = false;
						break;
					}
				}
				if (flag2) {
					flag = true;
					break;
				}
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		long ans = 0;
		for (int i = 1; i <= 1000000; i++) {
			if (solve(i)) {
				ans++;
			}
		}
		System.out.println(ans);
	}

}
