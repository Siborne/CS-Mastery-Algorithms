package Day124;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		while (reader.hasNextInt()) {
			int n = reader.nextInt();
			if (n == 0) {
				break;
			}
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = reader.nextInt();
			}

			sort(arr);
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < arr.length; i++) {
				sb.append(arr[i]).append(" ");
			}
			System.out.println(sb.toString());
		}

		reader.close();
	}

	private static void sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			boolean flag = false;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (Math.abs(arr[j]) < Math.abs(arr[j + 1])) {
					swap(arr, j, j + 1);
					flag = true;
				}
			}
			if (!flag) {
				break;
			}
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
