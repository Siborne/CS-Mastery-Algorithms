package Day117;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int a = reader.nextInt();
		int b = reader.nextInt();

		int minPosition = a + 1;
		int maxPosition = n - b;

		int start = Math.max(maxPosition, minPosition);

		int res = Math.max(0, n - start + 1);

		System.out.println(res);

		reader.close();
	}

}
