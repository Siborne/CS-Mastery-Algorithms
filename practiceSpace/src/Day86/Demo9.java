package Day86;

import java.util.Scanner;

public class Demo9 {

	private static final int MOD = 100;

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int[] count = new int[101];
		long ans = 0;
		for (int i = 0; i < n; i++) {
			int x = reader.nextInt();
			for (int j = x + 1; j <= 100; j++) {
				ans = (ans + count[j]) % MOD;
			}
			count[x]++;
		}
		System.out.println(ans);
		reader.close();
	}

}
