package Day93;

import java.util.Scanner;

public class Demo11 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int[] arr = new int[] { 6, 5, 4, 3, 2, 1 };
		System.out.println(n >= 1 && n <= 6 ? arr[n - 1] : -1);
		reader.close();
	}

}
