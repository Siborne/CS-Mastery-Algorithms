package Day122;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int a = reader.nextInt();
		StringBuilder sb = new StringBuilder();
		while (a > 0) {
			a--;
			int c = a % 26;
			sb.append((char) ('A' + c));
			a /= 26;
		}
		System.out.println(sb.reverse().toString());
		reader.close();
	}

}
