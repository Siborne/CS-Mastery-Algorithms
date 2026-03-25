package Day122;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int l = reader.nextInt();
			int r = reader.nextInt();
			int d = reader.nextInt();
			int u = reader.nextInt();
			if (l == r && r == d && d == u) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

		reader.close();
	}

}
