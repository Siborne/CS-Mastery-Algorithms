package Day63;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		reader.nextLine();
		while (t-- > 0) {
			char[] chs = reader.nextLine().toCharArray();
			StringBuilder sb = new StringBuilder();
			int len = chs.length;
			if (len % 2 == 1) {
				len--;
			}
			sb.append(chs[0]);
			for (int i = 1; i < len; i += 2) {
				sb.append(chs[i]);
			}
			System.out.println(sb.toString());

		}

		reader.close();
	}

}
