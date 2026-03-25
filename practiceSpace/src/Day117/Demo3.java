package Day117;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int m = reader.nextInt();
			int a = reader.nextInt();
			int b = reader.nextInt();
			int c = reader.nextInt();

			int maxm = m * 2;
			int res = 0;
			res += Math.min(m, a);
			res += Math.min(m, b);
			res += Math.min(c, maxm - res);
			System.out.println(res);

		}

		reader.close();
	}

}
