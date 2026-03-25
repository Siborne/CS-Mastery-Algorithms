package Day123;

import java.util.Scanner;

public class Demo22 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		while (reader.hasNextInt()) {
			int n = reader.nextInt();
			int m = reader.nextInt();
			if (n == 0 && m == 0) {
				break;
			}
			int[] arr = new int[n + 1];
			for (int i = 0; i < n; i++) {
				arr[i] = reader.nextInt();
			}
			int idx = n;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > m) {
					idx = i;
					break;
				}
			}

			for (int i = n; i > idx; i--) {
				arr[i] = arr[i - 1];
			}

			arr[idx] = m;

			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();

		}

		reader.close();
	}

}
