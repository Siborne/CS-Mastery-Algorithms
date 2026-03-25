package Day116;

import java.util.Arrays;
import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int n = reader.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = reader.nextInt();
			}
			if (canSort(arr, n)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

		reader.close();
	}

	private static boolean canSort(int[] a, int n) {
		int[] arr = Arrays.copyOf(a, n);

		boolean swapped;

		do {
			swapped = false;
			if (isSorted(arr)) {
				return true;
			}

			for (int i = 1; i < n - 1; i++) {
				if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					swapped = true;
					break;
				}
			}

		} while (swapped);
		
		return isSorted(arr);
	}

	private static boolean isSorted(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				return false;
			}
		}
		return true;
	}

}
