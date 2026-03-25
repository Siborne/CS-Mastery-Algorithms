package Day86;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int a = reader.nextInt();
			int b = reader.nextInt();
			int c = reader.nextInt();
			int sum1 = Math.abs(a - 1);
			int sum2;
			if (c > b) {
				sum2 = c - b + (c - 1);
			} else {
				sum2 = b - 1;
			}
			if (sum1 > sum2) {
				System.out.println("2");
			} else if (sum1 < sum2) {
				System.out.println("1");
			} else {
				System.out.println("3");
			}
		}

		reader.close();
	}

}
