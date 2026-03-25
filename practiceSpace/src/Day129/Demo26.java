package Day129;

import java.util.Scanner;

public class Demo26 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int T = reader.nextInt();
		while (T-- > 0) {
			int k = reader.nextInt();
			int cnt = 0;
			for (int x = 1; x <= 6; x++) {
				int y = k - x;
				if (x <= y && y <= 6) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}

		reader.close();
	}

}
