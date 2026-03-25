package Day83;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int t = reader.nextInt();
		reader.nextLine();
		while (t-- > 0) {
			char[] chs = reader.nextLine().toCharArray();
			StringBuilder sb = new StringBuilder();
			for (int i = chs.length - 1; i >= 0; i--) {
				if (chs[i] == 'q') {
					sb.append("p");
				} else if (chs[i] == 'p') {
					sb.append("q");
				} else {
					sb.append(chs[i]);
				}
			}
			System.out.println(sb.toString());
		}

		reader.close();
	}

}
