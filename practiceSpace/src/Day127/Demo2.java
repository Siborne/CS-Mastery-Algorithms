package Day127;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		char s = reader.next().charAt(0);
		char t = reader.next().charAt(0);
		int a = s - 'A';
		int b = t - 'A';
		int ans = a + b;
		if (ans >= 26) {
			System.out.println((char) ('A' + ans / 26) + "" + (char) ('A' + ans % 26));
		} else {
			System.out.println((char) ('A' + ans % 26));
		}

		reader.close();
	}

}
