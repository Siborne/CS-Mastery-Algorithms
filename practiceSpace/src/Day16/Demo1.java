package Day16;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int[] arr = new int[n + 1];
		int[] brr = new int[n + 1];

		for (int i = 0; i < n; i++) {
			arr[i] = reader.nextInt();
		}

		for (int i = 0; i < n / 2; i++) {
			if (arr[i] < arr[n - i - 1]) {
				brr[i] = arr[n - i - 1] - arr[i];
			} else {
				brr[n - i - 1] = arr[i] - arr[n - i - 1];
			}
		}

		long ans = 0;
		for (int i = 0; i < n; i++) {
			long mn = Math.min(brr[i], brr[i + 1]);

			brr[i] -= mn;
			brr[i + 1] -= mn;
			ans += mn;
			ans += brr[i];
		}
		System.out.println(ans);
	}

}
