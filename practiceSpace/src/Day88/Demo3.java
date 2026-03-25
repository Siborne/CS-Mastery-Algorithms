package Day88;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int n = reader.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = reader.nextInt();
			}
			boolean alreadyNotSorted = false;
			for (int i = 1; i < n; i++) {
				if (arr[i] < arr[i - 1]) {
					alreadyNotSorted = true;
					break;
				}
			}

			if (alreadyNotSorted) {
				System.out.println(0);
				continue;
			}

			int ans = Integer.MAX_VALUE;
			for (int i = 1; i < n; i++) {
				int d = arr[i] - arr[i - 1]; // d >= 0
				int opsNeeded = (d + 2) / 2; // 整数除法，等价于 ceil((d+1)/2)
				if (opsNeeded < ans) {
					ans = opsNeeded;
				}
			}

			System.out.println(ans);
		}

		reader.close();
	}

}
