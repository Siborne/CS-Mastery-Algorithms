package Day85;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		reader.nextLine();
		char[] chs = reader.nextLine().toCharArray();
		int zero = 0;
		int one = 0;
		for (char ch : chs) {
			if (ch == '0') {
				zero++;
			} else {
				one++;
			}
		}
		int ans = Math.max(zero, one) - Math.min(zero, one);
		System.out.println(ans);
		reader.close();
	}

}
