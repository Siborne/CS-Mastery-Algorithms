package week2.day8;

import java.util.Scanner;

public class T1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		String s = reader.nextLine();
		int k = reader.nextInt();

		int n = s.length();
		int[] cnt = new int[26];
		long ans = 0;
		int left = 0;

		for (int right = 0; right < n; right++) {
			int idx = s.charAt(right) - 'a';
			cnt[idx]++;

			while (cnt[idx] > k) {
				cnt[s.charAt(left++) - 'a']--;
			}

			ans += right - left + 1;
		}
		System.out.println(ans);
		reader.close();
	}

}
