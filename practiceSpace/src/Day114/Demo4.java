package Day114;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int num = reader.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = reader.nextInt();
		}
		int cnt = 0;
		do {
			cnt++;
			if (cnt == num + 1) {
				for (int i = 0; i < n; i++) {
					System.out.print(arr[i]);
					if (i < n - 1) {
						System.out.print(" ");
					}
				}
				System.out.println();
				break;
			}
		} while (nextPermutation(arr));

		reader.close();
	}

	private static boolean nextPermutation(int[] arr) {
		int i = arr.length - 2;
		while (i >= 0 && arr[i] >= arr[i + 1]) {
			i--;
		}

		if (i < 0) {
			return false;
		}
		int j = arr.length - 1;
		while (arr[j] <= arr[i]) {
			j--;
		}

		swap(arr, i, j);

		reverse(arr, i + 1, arr.length - 1);

		return true;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	private static void reverse(int[] arr, int start, int end) {
		while (start < end) {
			swap(arr, start++, end--);
		}
	}

}
