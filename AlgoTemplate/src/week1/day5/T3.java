package week1.day5;

import java.util.Scanner;

public class T3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int m = reader.nextInt();
		reader.nextLine();

		int ans = Integer.MAX_VALUE;
		int[] w = new int[n + 1];
		int[] b = new int[n + 1];
		int[] r = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			String s = reader.nextLine();
			w[i] = w[i - 1] + check(s, 'W', m);
			b[i] = b[i - 1] + check(s, 'B', m);
			r[i] = r[i - 1] + check(s, 'R', m);
		}
		
		for (int i = 1; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				ans = Math.min(ans, w[i] + b[j] - b[i] + r[n] - r[j]);
			}
		}

		System.out.println(ans);
		reader.close();
	}

	private static int check(String s, char c, int m) {
		int total = 0;
		for (int i = 0; i < m; i++) {
			if (s.charAt(i) != c) {
				total++;
			}
		}
		return total;
	}

}
