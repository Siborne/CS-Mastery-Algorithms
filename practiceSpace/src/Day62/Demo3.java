package Day62;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int x = reader.nextInt();
			int n = 0;
			while (x > 0) {
				n += x % 10;
				x /= 10;
			}
			System.out.println(n);
		}

		reader.close();
	}

}
