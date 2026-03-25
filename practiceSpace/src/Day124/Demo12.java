package Day124;

import java.util.Arrays;
import java.util.Scanner;

public class Demo12 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = reader.nextInt();
		}
		Arrays.sort(arr);
		int ans = Integer.MAX_VALUE;
		for (int i = 1; i < arr.length; i++) {
			ans = Math.min(ans, arr[i] - arr[i - 1]);
		}
		System.out.println(ans);
		reader.close();
	}

}
