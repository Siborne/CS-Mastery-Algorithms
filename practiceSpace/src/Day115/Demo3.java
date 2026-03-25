package Day115;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int[] arr = new int[55];
		arr[1] = 1;
		arr[2] = 1;
		for (int i = 3; i <= n; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		System.out.println(arr[n]);
		reader.close();
	}

}
