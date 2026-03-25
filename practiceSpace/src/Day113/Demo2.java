package Day113;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			long x = reader.nextLong();
			int c = Long.bitCount(x);
			long k = (1L << c) - 1;
			System.out.println(c + " " + k);
		}

		reader.close();
	}

}
