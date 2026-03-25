package Day53;

import java.util.Arrays;
import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = reader.nextInt();
		}

		Arrays.sort(arr);

		for (int a : arr) {
			System.out.print(a + " ");
		}

		reader.close();
	}

}
