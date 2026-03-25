package g2025;

import java.util.Scanner;

public class T8 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int q = reader.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = reader.nextInt();
		}
		while (q-- > 0) {
			int l = reader.nextInt() - 1;
			int r = reader.nextInt() - 1;
			int[] brr = new int[n];
			for (int i = l; i <= r; i++) {
				brr[i] = a[i];
			}
			long ans = 0;
			for (int i = l; i <= r - 1; i++) {
				if (brr[l] > brr[l + 1]) {
					int diff = brr[l] - brr[l + 1];
					ans += diff;
					brr[l + 1] += diff;
				}
			}
			System.out.println(ans);
		}

		reader.close();
	}

}
