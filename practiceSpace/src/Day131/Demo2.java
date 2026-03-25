package Day131;

import java.util.Scanner;

public class Demo2 {

	private static long totalCost = 0;

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int m = reader.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = reader.nextInt();
		}

		while (m-- > 0) {
			int d = reader.nextInt();
			shellSort(arr, d);
		}
		System.out.println(totalCost);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			if (i > 0) {
				sb.append(" ");
			}
			sb.append(arr[i]);
		}
		System.out.println(sb.toString());

		reader.close();
	}

	private static void shellSort(int[] arr, int d) {

//		int i = 0;
//		while (i < d) {
//			for (int j = i; j < arr.length; j += d) {
//				if (j - d < 0) {
//					continue;
//				}
//				int temp = arr[j];
//				int k;
//				for (k = j; k >= 0; k -= d) {
//					totalCost++;
//					if (k - d >= 0 && temp >= arr[k - d]) {
//						arr[k] = temp;
//						break;
//					} else if (k - d >= 0) {
//						arr[k] = arr[k - d];
//					} else {
//						arr[k] = temp;
//						break;
//					}
//				}
//			}
//			i++;
//		}

		int n = arr.length;
		for (int start = 0; start < d; start++) {
			for (int j = start; j < n; j += d) {
				int key = arr[j];
				int k = j;
				int cost = 1;
				while (k >= d && arr[k - d] > key) {
					arr[k] = arr[k - d];
					k -= d;
					cost++;
				}
				arr[k] = key;

//				totalCost += Math.abs(j - k) + 1;
				totalCost += cost;
			}
		}
	}

}
