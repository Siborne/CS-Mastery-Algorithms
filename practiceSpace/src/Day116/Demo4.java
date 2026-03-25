package Day116;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int n = reader.nextInt();
			int[] arr = new int[n];
			int totalTwos = 0;
			for (int i = 0; i < arr.length; i++) {
				arr[i] = reader.nextInt();
				if (arr[i] == 2) {
					totalTwos++;
				}
			}

			if (totalTwos % 2 != 0) {
				System.out.println(-1);
				continue;
			}

			int target = totalTwos / 2;
			int leftTwos = 0;
			int result = -1;
			for (int k = 0; k < n - 1; k++) {
				if (arr[k] == 2) {
					leftTwos++;
				}
				if (leftTwos == target) {
					result = leftTwos = k + 1;
					break;
				}
			}
			System.out.println(result);
		}

		reader.close();
	}

}
