package Day127;

import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = reader.nextInt();
		}

		int[] left = new int[n];
		int[] right = new int[n];

		left[0] = 1;
		for (int i = 1; i < n; i++) {
			if (arr[i] > arr[i - 1]) {
				left[i] = left[i - 1] + 1;
			} else if (arr[i] == arr[i - 1]) {
				left[i] = left[i - 1];
			} else {
				left[i] = 1;
			}
		}

		right[n - 1] = 1;
		for (int i = n - 2; i >= 0; i--) {
			if (arr[i] > arr[i + 1]) {
				right[i] = right[i + 1] + 1;
			} else if (arr[i] == arr[i + 1]) {
				right[i] = right[i + 1];
			} else {
				right[i] = 1;
			}
		}

		long ans = 0;
		for (int i = 0; i < n; i++) {
			ans += Math.max(left[i], right[i]);
		}
		System.out.println(ans);
		
		reader.close();
	}

}
