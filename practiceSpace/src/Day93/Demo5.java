package Day93;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int ans = 0;
		for (int i = 0; i < 3; i++) {
			int x = reader.nextInt();
			if (x < 0) {
				ans++;
			}
		}
		System.out.println(ans == 2 ? "YES" : "NO");
		reader.close();
	}

}
