package Day98;

import java.util.Arrays;
import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int q = reader.nextInt();
		int[] arr = new int[n];
//		int[] brr = new int[n + 1];
		for (int i = 0; i < n; i++) {
			arr[i] = reader.nextInt();
//			brr[i + 1] = arr[i] + brr[i];
		}
		int[] crr = new int[n + 2];
		while (q-- > 0) {
			int l = reader.nextInt();
			int r = reader.nextInt();
			crr[l]++;
			crr[r+1]--;
		}
		for (int i = 1; i <= n + 1; i++) {
			crr[i] += crr[i - 1];
		}
		Arrays.sort(crr, 1, n + 1);
		Arrays.sort(arr, 0, n);
		long ans = 0;
		for (int i = n - 1; i >= 0; i--) {
			if (crr[i + 1] <= 0) {
				break;
			}
			ans += crr[i + 1] * arr[i];
		}
		System.out.println(ans);
		reader.close();
	}

}
