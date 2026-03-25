package Day63;

import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int n = reader.nextInt();
			int k = reader.nextInt();
			int ans = 0;
			if (k % (n - 1) != 0) {
				ans = k / (n - 1) + k;
			} else {
				ans = (k / (n - 1)) * n - 1;
			}
			System.out.println(ans);
		}

		reader.close();
	}

}
