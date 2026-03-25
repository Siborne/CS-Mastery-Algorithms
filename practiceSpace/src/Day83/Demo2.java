package Day83;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int n = reader.nextInt();
			int m = reader.nextInt();
			int k = reader.nextInt();
			int[] arr = new int[n];
			int[] brr = new int[m];
			for (int i = 0; i < n; i++) {
				arr[i] = reader.nextInt();
			}
			for (int i = 0; i < m; i++) {
				brr[i] = reader.nextInt();
			}
			long ans = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (arr[i] + brr[j] <= k) {
						ans++;
					}
				}
			}
			System.out.println(ans);
		}

		reader.close();
	}

}
