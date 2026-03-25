package Day93;

import java.util.Scanner;

public class Demo22 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int m = reader.nextInt();
		int k = reader.nextInt();
		int ans = 0;
		for (int i = n; i <= m;) {
			if (i % k == 0) {
				ans++;
				i += k;
			} else {
				i++;
			}
		}
		System.out.println(ans);
		reader.close();
	}

}
