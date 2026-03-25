package Day98;

import java.util.Arrays;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int m = reader.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = reader.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(arr[n-m]);

		reader.close();
	}

}
