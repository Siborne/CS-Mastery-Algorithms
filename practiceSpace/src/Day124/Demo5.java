package Day124;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		while (reader.hasNextInt()) {
			int n = reader.nextInt();
			reader.nextLine();
			while (n-- > 0) {
				char[] chs = reader.nextLine().toCharArray();
				if (Character.isDigit(chs[0]) || !test(chs[0])) {
					System.out.println("no");
					continue;
				}
				boolean flag = true;
				for (int i = 1; i < chs.length && flag; i++) {
					if (!test(chs[i]) && !Character.isDigit(chs[i])) {
						flag = false;
						break;
					}
				}
				if (flag) {
					System.out.println("yes");
				}else {
					System.out.println("no");
				}
			}
		}

		reader.close();
	}

	private static boolean test(char c) {
		if (Character.isLetter(c) || c == '_') {
			return true;
		}
		return false;
	}

}
