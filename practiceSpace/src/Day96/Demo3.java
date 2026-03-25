package Day96;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int ans = 0;
		for (int i = 0; i < n; i++) {
			int x = reader.nextInt();
			ans = Math.max(ans, x);
		}
		System.out.println(ans);
		reader.close();
	}

}
