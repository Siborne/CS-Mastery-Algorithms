package Day127;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int a = reader.nextInt();
		int b = reader.nextInt();
		int c = reader.nextInt();
		int ans = a + b + c;
		if (a == b && b == c) {
			ans += 100;
		}
		System.out.println(ans);

		reader.close();
	}

}
