package Day72;

import java.util.Arrays;
import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int n = reader.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = reader.nextInt();
			}
			Arrays.sort(arr);
			int ans = Integer.MAX_VALUE;
			for (int i = 0; i < n - 1; i++) {
				ans = Math.min(arr[i + 1] - arr[i], ans);
			}
			System.out.println(ans);
		}

		reader.close();
	}

}
