package Day103;

import java.util.Scanner;

public class Demo12 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		char[] chs = reader.next().toCharArray();
		int ans = 0;
		for (char ch : chs) {
			if (ch == '0') {
				ans++;
			}
		}
		System.out.println(ans);
		reader.close();
	}

}
