package Day78;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int n = reader.nextInt();
			long sum = 0;
			for (int i = 0; i < n; i++) {
				long x = reader.nextLong();
				sum += x;
			}
			long temp = (long)Math.sqrt(sum);
			if(temp*temp==sum) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}

		reader.close();
	}

}
