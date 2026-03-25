package Day128;

import java.util.Scanner;

public class Demo12 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int n = reader.nextInt();
			int max = Integer.MIN_VALUE;
			while (n-- > 0) {
				int x = reader.nextInt();
				max = Math.max(max, x);
			}
			System.out.println(max);
		}

		reader.close();
	}

}
