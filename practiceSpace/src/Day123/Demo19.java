package Day123;

import java.util.Scanner;

public class Demo19 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		while (reader.hasNextInt()) {
			int n = reader.nextInt();
			if (n == 0) {
				break;
			}
			int[] arr = new int[n];
			int minIndex = 0;
			for (int i = 0; i < arr.length; i++) {
				arr[i] = reader.nextInt();
				if (arr[i] < arr[minIndex]) {
					minIndex = i;
				}
			}
			int temp = arr[0];
			arr[0] = arr[minIndex];
			arr[minIndex] = temp;
			StringBuilder sb = new StringBuilder();
			for (int i : arr) {
				sb.append(i).append(" ");
			}
			System.out.println(sb.toString());
		}

		reader.close();
	}

}
