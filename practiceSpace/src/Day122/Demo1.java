package Day122;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int n = reader.nextInt();
			int k = reader.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = reader.nextInt();
			}

			int ans = 0;
			switch (k) {
			case 2:
				ans =solveK2(arr);
				break;
			case 3:
			case 5:
				ans = solveK35(arr, k);
				break;
			case 4:
				ans = solveK4(arr);
				break;
			}
			System.out.println(ans);
		}

		reader.close();
	}

	private static int solveK2(int[] arr) {
		for (int x : arr) {
			if ((x & 1) == 0) {
				return 0;
			}
		}
		return 1;
	}

	private static int solveK35(int[] arr, int k) {
		for (int x : arr) {
			if (x % k == 0) {
				return 0;
			}
		}
		int minCost = Integer.MAX_VALUE;
		for (int x : arr) {
			int r = x % k;
			int cost = k - r;
			minCost = Math.min(minCost, cost);
		}
		return minCost;
	}

	private static int solveK4(int[] arr) {
		int evenCount = 0;
		boolean hasDiv4 = false;
		for (int a : arr) {
			if (a % 2 == 0) {
				evenCount++;
			}
			if (a % 4 == 0) {
				hasDiv4 = true;
				break;
			}
		}

		if (hasDiv4 || evenCount >= 2) {
			return 0;
		}

		int cost1 = Integer.MAX_VALUE;
		for (int a : arr) {
			int r = a % 4;
			int cost = 4 - r;
			cost1 = Math.min(cost, cost1);
		}

		int cost2 = 2 - evenCount;

		return Math.min(cost1, cost2);

	}

}
