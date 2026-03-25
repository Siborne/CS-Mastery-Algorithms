package Day93;

import java.util.Scanner;

public class Demo12 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int[] arr = new int[] { 6, 5, 4, 3, 2, 1 };
		System.out.println(arr[n - 1] + n);

		reader.close();
	}

}
