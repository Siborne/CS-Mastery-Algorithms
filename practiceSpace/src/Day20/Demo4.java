package Day20;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = reader.nextInt();
		}
		int[] brr = new int[n];
		for (int i = 0; i < n; i++) {
			brr[i] = arr[(i + 1) % n] + arr[(i + n - 1) % n];
		}
		for (int num : brr) {
			System.out.print(num + " ");
		}
		reader.close();
	}

}
