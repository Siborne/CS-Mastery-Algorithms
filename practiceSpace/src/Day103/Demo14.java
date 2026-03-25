package Day103;

import java.util.Scanner;

public class Demo14 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		char[] chs = reader.nextLine().toCharArray();
		int ans = 0;
		long sum = 0;
		for (char ch : chs) {
			sum += ch - '0';
			if (sum % 9 == 0) {
				ans++;
			}
		}
		System.out.println(ans);
		reader.close();
	}

}
