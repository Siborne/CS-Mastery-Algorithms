package Day83;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int ans = 0;
		for (int i = 1; i < n; i++) {
			if (n % (i) == 0) {
				ans++;
			}
		}
		System.out.println(ans);
		reader.close();
	}

}
