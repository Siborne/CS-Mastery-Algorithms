package Day128;

import java.util.Scanner;

public class Demo9 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int y1 = reader.nextInt();
			int n = reader.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = reader.nextInt();
			}
			int y2 = reader.nextInt();
			int sum = y2 - y1 + 1;
			for (int i = 0; i < arr.length; i++) {
				if (y1 <= arr[i] && arr[i] <= y2) {
					sum--;
				}
			}
			System.out.println(sum);
		}

		reader.close();
	}

}
