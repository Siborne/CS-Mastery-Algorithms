package Day111;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		long ans = 0;
		while (n-- > 0) {
			ans += reader.nextLong();
		}
		System.out.println(ans);
		reader.close();
	}

}
