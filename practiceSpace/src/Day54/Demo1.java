package Day54;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int[] arr = new int[n];
		int maxn = 0;
		int minn = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = reader.nextInt();
			if (arr[i] > arr[maxn]) {
				maxn = i;
			}
			if (arr[i] <= arr[minn]) {
				minn = i;
			}
		}

		int swap;
		if (maxn < minn) {
			swap = maxn + (n - 1 - minn);
		} else {
			swap = maxn + (n - 1 - minn) - 1;
		}

		System.out.println(swap);
		reader.close();
	}

}
