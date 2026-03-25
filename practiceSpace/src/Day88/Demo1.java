package Day88;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int n = reader.nextInt();
			int k = reader.nextInt();
			int ans = 0;
			int have = 0;
			for (int i = 0; i < n; i++) {
				int x = reader.nextInt();
				if (x >= k) {
					have += x;
				} else if (x == 0 && have > 0) {
					ans++;
					have--;
				}
			}
			System.out.println(ans);
		}

		reader.close();
	}

}
