package Day127;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		reader.nextLine();
		while (n-- > 0) {
			StringBuilder sb = new StringBuilder();
			char[] chs = reader.nextLine().toCharArray();
			for (char c : chs) {
				if (c == '1' || c == 'i' || c == 'I' || c == 'l') {
					continue;
				}
				sb.append(c);
			}
			System.out.println(sb.toString());
		}

		reader.close();
	}

}
