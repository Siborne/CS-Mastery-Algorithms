package Day117;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int n = reader.nextInt();
			int k = reader.nextInt();

			boolean flag = false;
			StringBuilder sb = new StringBuilder();

			if (n >= k && (n - k) % 2 == 0) {
				flag = true;
				sb.append("YES\n");
				for (int i = 0; i < k - 1; i++) {
					sb.append("1 ");
				}
				sb.append(n - (k - 1));
			} else if (n >= 2 * k && n % 2 == 0) {
				flag = true;
				sb.append("YES\n");
				for (int i = 0; i < k - 1; i++) {
					sb.append("2 ");
				}
				sb.append(n - 2 * (k - 1));
			}

			System.out.println(flag ? sb.toString() : "NO");

		}

		reader.close();
	}

}
