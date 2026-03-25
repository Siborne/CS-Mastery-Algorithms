package Day127;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int a = reader.nextInt();
		int b = reader.nextInt();
		int c = reader.nextInt();
		int d = reader.nextInt();

		int ans = a + b + c * 2 + d * 3;
		System.out.println(ans);

		reader.close();
	}

}
