package Day128;

import java.util.Scanner;

public class Demo10 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int n = reader.nextInt();
			int x = reader.nextInt();
			int a = reader.nextInt();
			int b = reader.nextInt();
			int ans = x * b + (n - x) * a;
			System.out.println(ans);
		}

		reader.close();
	}

}
