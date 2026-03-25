package Day85;

import java.util.Arrays;
import java.util.Scanner;

public class Demo13 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		long k = reader.nextLong();
		long[] arr = new long[n];
		for (int i = 0; i < n; i++) {
			arr[i] = reader.nextLong();
		}
		Arrays.sort(arr);
		long ans = 0;
//		int i = 0;
//		while (k-- > 0) {
//			ans += arr[i];
//			if (arr[i] <= 1) {
//				i++;
//			} else {
//				arr[i]--;
//			}
//		}
		for (int i = 0; i < n && k > 0; i++) {
			if (k >= arr[i]) {
				ans += calc(arr[i], arr[i]);
				k -= arr[i];
			} else {
				ans += calc(arr[i], k);
				break;
			}
		}
		System.out.println(ans);
		reader.close();
	}

	private static long calc(long n, long k) {
		return ((n - k + 1) + n) * k / 2;
	}

}
