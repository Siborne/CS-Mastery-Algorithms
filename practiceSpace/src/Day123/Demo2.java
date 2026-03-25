package Day123;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = reader.nextInt();
		}
		int[] brr = new int[n];
		for (int i = 0; i < brr.length; i++) {
			int x = reader.nextInt() - 1;
			int y = reader.nextInt() - 1;
			brr[i] = arr[x] + arr[y];
		}

		long cost = 0;
		for (int i = 0; i < brr.length; i++) {
			cost += Math.min(arr[i], brr[i]);
		}
		System.out.println(cost);

		reader.close();
	}

}
