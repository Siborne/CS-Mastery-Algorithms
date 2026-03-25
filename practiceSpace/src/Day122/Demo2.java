package Day122;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int n = reader.nextInt();
			int a = reader.nextInt();
			int b = reader.nextInt();

			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < n; i++) {
				char c = (char) ('a' + (i % a) % b);
				sb.append(c);
			}
			System.out.println(sb.toString());
		}

		reader.close();
	}

}
