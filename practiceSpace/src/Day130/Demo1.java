package Day130;

import java.util.Arrays;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = reader.nextInt();
		}
		Arrays.sort(arr);
		long ans = 0;
		ans += arr[0] * 6 + 5 + 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == arr[i - 1]) {
				ans++;
			} else {
				ans += (arr[i] - arr[i - 1]) * 6 + 5 + 1;
			}
		}
		ans += arr[n - 1] * 4;
		System.out.println(ans);
		reader.close();
	}

}
