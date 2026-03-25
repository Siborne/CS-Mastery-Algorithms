package Day118;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int n = reader.nextInt();
			int k = n / 2;
			long sum1 = (1L << n);
			for (int i = 1; i < k; i++) {
				sum1 += (1L << i);
			}
			long sum2 = 0;
			for (int i = k; i < n; i++) {
				sum2 += (1L << i);
			}
			System.out.println(sum1 - sum2);
		}

		reader.close();
	}

}
