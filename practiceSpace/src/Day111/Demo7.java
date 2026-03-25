package Day111;

import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int T = reader.nextInt();
		while (T-- > 0) {
			int n = reader.nextInt();
			long ans = 0;
			while (n-- > 0) {
				ans += reader.nextLong();
			}
			System.out.println(ans);
		}
		reader.close();
	}
	
}
