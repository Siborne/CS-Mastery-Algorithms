package Day89;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		String s = reader.nextLine();
		String[] strs = new String[] { "144", "14", "1" };

		int index = 0;
		while (index < s.length()) {
			boolean flag = false;

			for (int i = 0; i < strs.length; i++) {
				if (s.startsWith(strs[i], index)) {
					index +=strs[i].length();
					flag = true;
					break;
				}
			}

			if (!flag) {
				System.out.println("NO");
				return;
			}
		}

		System.out.println("YES");

		reader.close();
	}

}
