package Day104;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int n = reader.nextInt();
			for (int i = 0; i < n; i++) {
				if (i > 0) {
					System.out.print(" ");
				}
				if ((i & 1) == 0) {
					System.out.print("1");
				} else {
					System.out.print("2");
				}
			}
			System.out.println();
		}

		reader.close();
	}

}
