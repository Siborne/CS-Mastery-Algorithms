package Day128;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		char[] targets = reader.nextLine().toCharArray();

		int n = reader.nextInt();
		reader.nextLine();
		StringBuilder sb = new StringBuilder();
		int cnt = 0;
		while (n-- > 0) {
			char[] source = reader.nextLine().toCharArray();
			boolean flag = true;
			for (int i = 0; i < source.length; i++) {
				if (targets[i] == '*') {
					continue;
				} else if (targets[i] != source[i]) {
					flag = false;
					break;
				}
			}

			if (flag) {
				cnt++;
				sb.append(source).append("\n");
			}

		}

		System.out.println(cnt);
		System.out.println(sb.toString());
		reader.close();
	}

}
