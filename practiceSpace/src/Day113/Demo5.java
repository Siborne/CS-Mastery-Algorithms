package Day113;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		char x = reader.next().charAt(0);
		int cnt = 0;
		for (int i = 1; i <= n; i++) {
			String a = String.valueOf(i);
			for (int j = 0; j < a.length(); j++) {
				if (a.charAt(j) == x) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
		reader.close();
	}

}
