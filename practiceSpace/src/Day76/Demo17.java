package Day76;

import java.util.Scanner;

public class Demo17 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int m = reader.nextInt();

		if (n < 1 || m > 9 * n || n == 0) {
			System.out.println("-1 -1");
			return;
		}

		if (m == 0) {
			if (n == 1) {
				System.out.println("0 0");
			} else {
				System.out.println("-1 -1");
			}
			return;
		}

		int[] minNum = new int[n];
		minNum[0] = 1;
		int temp = m - 1;

		for (int i = n - 1; i >= 0 && temp > 0; i--) {
			int add = Math.min(temp, 9);
			minNum[i] += add;
			temp -= add;
		}

		int[] maxNum = new int[n];
		temp = m;

		for (int i = 0; i < n && temp > 0; i++) {
			int add = Math.min(temp, 9);
			maxNum[i] += add;
			temp -= add;
		}

		StringBuilder min = new StringBuilder();
		StringBuilder max = new StringBuilder();

		for (int num : minNum) {
			min.append(num);
		}
		for (int num : maxNum) {
			max.append(num);
		}

		System.out.println(min + " " + max);

		reader.close();
	}

}
