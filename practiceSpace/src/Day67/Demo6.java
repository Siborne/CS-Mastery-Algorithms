package Day67;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int n = reader.nextInt();
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			while(n-->0) {
				int x = reader.nextInt();
				max = Math.max(x, max);
				min = Math.min(x, min);
			}
			System.out.println(max-min);
		}

		reader.close();
	}

}
