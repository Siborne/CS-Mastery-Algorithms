package Day114;

import java.util.Arrays;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int maxValue = reader.nextInt();
		int n = reader.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = reader.nextInt();
		}
		Arrays.sort(arr);
		int ans = 0;

		for (int i = n - 1, j = 0; i >= j; i--) {
			if (i != j && arr[i] + arr[j] <= maxValue) {
				j++;
			}
			ans++;
		}
		System.out.println(ans);
		reader.close();
	}

}
