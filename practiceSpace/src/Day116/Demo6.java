package Day116;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int n = reader.nextInt();

			for (int i = 0, x = 0; i < 2 * n; i++, x = (x + 1) % 4) {
				StringBuilder sb = new StringBuilder();
				for (int j = 0, y = 0; j < 2 * n; j++, y = (y + 1) % 4) {
					if (x<=1) {
						if (y<=1) {
							sb.append("#");
						}else {
							sb.append(".");
						}
					}else {
						if (y<=1) {
							sb.append(".");
						}else {
							sb.append("#");
						}
					}
				}
				System.out.println(sb.toString());
			}
		}

		reader.close();
	}

}
