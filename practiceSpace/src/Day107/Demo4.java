package Day107;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String s = reader.next();
		long n = reader.nextLong();
		long len = s.length();
		long i;
		while (len < n) {
			i = len;
			while (n > i) {
				i *= 2;
			}
			i = i / 2;
			n -= (i + 1);
			if (n == 0) {
				n = i;
			}
		}

		System.out.println(s.charAt((int)n - 1));

		reader.close();
	}

}
