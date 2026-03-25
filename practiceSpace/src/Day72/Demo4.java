package Day72;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int n = reader.nextInt();
			reader.nextLine();
			char[] chs1 = reader.nextLine().toCharArray();
			char[] chs2 = reader.nextLine().toCharArray();
			boolean flag = true;
			for (int i = 0; i < n; i++) {
				char ch1 = '*';
				if (chs1[i] == 'R') {
					ch1 = 'R';
				}
				char ch2 = '*';
				if (chs2[i] == 'R') {
					ch2 = 'R';
				}
				if (ch1 != ch2) {
					flag = false;
					break;
				}
			}
			System.out.println(flag ? "YES" : "NO");
		}

		reader.close();
	}

}
