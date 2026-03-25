package Day127;

import java.util.Scanner;

public class Demo14 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int m = reader.nextInt();
		reader.nextLine();

		String special = "~!@#$%^";

		while (m-- > 0) {
			String pwd = reader.nextLine();
			int len = pwd.length();
			if (len < 8 || len > 16) {
				System.out.println("NO");
				continue;
			}

			boolean[] flag = new boolean[4];

			for (char c : pwd.toCharArray()) {
				if (c >= 'A' && c <= 'Z') {
					flag[0] = true;
				} else if (c >= 'a' && c <= 'z') {
					flag[1] = true;
				} else if (c >= '0' && c <= '9') {
					flag[2] = true;
				} else if (special.indexOf(c) != -1) {
					flag[3] = true;
				}
			}

			int cnt = 0;
			for (boolean b : flag) {
				if (b) {
					cnt++;
				}
			}
			if (cnt >= 3) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		}

		reader.close();
	}

}
