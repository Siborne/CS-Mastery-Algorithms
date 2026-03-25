package Day80;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int n = reader.nextInt();
			int[] arr = new int[n];
			int[] brr = new int[n];
			int mina = Integer.MAX_VALUE;
			for (int i = 0; i < n; i++) {
				arr[i] = reader.nextInt();
				mina = Math.min(mina, arr[i]);
			}
			int minb = Integer.MAX_VALUE;
			for (int i = 0; i < n; i++) {
				brr[i] = reader.nextInt();
				minb = Math.min(minb, brr[i]);
			}

			long ans = 0;
			for (int i = 0; i < n; i++) {
				int c = arr[i] - mina;
				int d = brr[i] - minb;
				ans += Math.max(c, d);
			}
			System.out.println(ans);

		}

		reader.close();
	}

}
