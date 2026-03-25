package Day17;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int k = reader.nextInt();
		reader.nextLine();
		String s = reader.nextLine();

		int len = s.length();
		if (len % k != 0) {
			System.out.println(-1);
			return;
		}
		int cir = len / k;
		int ans = 0;
		for (int i = 0; i < cir; i++) {
			int[] sum = new int[26];
			int maxC = Integer.MIN_VALUE;
			for (int j = i; j < len; j += cir) {
				sum[s.charAt(j) - 'a']++;
			}

			for (int c = 0; c < 26; c++) {
				maxC = Math.max(maxC, sum[c]);
			}
			
			ans+=(k-maxC);
		}
		System.out.println(ans);

	}

}
