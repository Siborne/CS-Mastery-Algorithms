package Day72;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int n = reader.nextInt();
			int x = reader.nextInt();
			if (n <= 2) {
				System.out.println(1);
			} else {
				for (int i = 1;; i++) {
					int now = 2 + i * x;
					if (now >= n) {
						System.out.println(i + 1);
						break;
					}
				}
			}
		}

		reader.close();
	}

}
