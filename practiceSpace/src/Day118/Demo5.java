package Day118;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int a = reader.nextInt();
			int b = reader.nextInt();
			int c = reader.nextInt();
			
			int max = Math.max(a, b);
			int min = Math.min(a, b);
			int diff = max-min;
			int res = (int)(diff + 2*c -1) / (2*c);
			System.out.println(res);
		}

		reader.close();
	}

}
