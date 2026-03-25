package Day111;

import java.util.Scanner;

public class Demo20 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int l = reader.nextInt();
		int r = reader.nextInt();
		System.out.println(count(l, r));
		reader.close();
	}

	private static int count(int l, int r) {
		StringBuilder sb = new StringBuilder();
		for (int i = l; i <= r; i++) {
			sb.append(i);
		}
		String num = sb.toString();
		int cnt = 0;
		for (int i = 0; i < num.length(); i++) {
			if (num.charAt(i) == '2') {
				cnt++;
			}
		}
		return cnt;
	}

}
