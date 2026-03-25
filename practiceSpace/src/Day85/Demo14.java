package Day85;

import java.util.Arrays;
import java.util.Scanner;

public class Demo14 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int k = reader.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = reader.nextInt();
		}
		long l = 0;
		long r = 1_000_000_000_0L;
		long tempValue = -1;
		while (l <= r) {
			long mid = (r - l) / 2 + l;
			if (check(arr, mid, k)) {
				l = mid + 1;
				tempValue = mid;
			} else {
				r = mid - 1;
			}
		}
		long ans = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] >= tempValue) {
				ans += (arr[i] - tempValue) * (tempValue + 1 + arr[i]) / 2;
				k -= arr[i] - tempValue;
			}
		}
		
		ans += tempValue*k;

		System.out.println(ans);
		reader.close();
	}

	private static boolean check(int[] arr, long mid, long k) {
		long count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > mid) {
				count += arr[i] - mid + 1;
			}
		}
		return count >= k;
	}

	private static int calc(int n, int k) {
		return (2 * n - k + 1) * k / 2;
	}

}
