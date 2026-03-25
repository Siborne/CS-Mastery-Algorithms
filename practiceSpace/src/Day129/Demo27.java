package Day129;

import java.util.Scanner;

public class Demo27 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int T = reader.nextInt();
		reader.nextLine();
		while (T-- > 0) {
			String s = reader.nextLine();
			int n = s.length();

			if (n == 1) {
				System.out.println(0);
				continue;
			}

			int ans = -1;
			for (int d = 0; d < n; d++) {
				char first = s.charAt(d);
				char last = s.charAt((d - 1 + n) % n);
				if (first == last) {
					ans = d;
					break;
				}
			}
			System.out.println(ans);
		}

		reader.close();
	}

}
