package Day62;

import java.util.Scanner;

public class Demo8 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int ans = 0;
		int[] arr = new int[n];
		int max = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = reader.nextInt();
			max = Math.max(max, arr[i]);
		}

		for (int a : arr) {
			ans += max - a;
		}
		System.out.println(ans);

		reader.close();
	}

}
