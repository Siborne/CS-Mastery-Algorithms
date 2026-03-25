package Day123;

import java.util.Scanner;

public class Demo20 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		reader.nextLine();
		while (n-- > 0) {
			int ans = 0;
			char[] chs = reader.nextLine().toCharArray();
			for (char c : chs) {
				if (c >= '0' && c <= '9') {
					ans++;
				}
			}
			System.out.println(ans);
		}

		reader.close();
	}

}
