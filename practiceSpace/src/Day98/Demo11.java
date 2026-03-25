package Day98;

import java.util.Scanner;

public class Demo11 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		long ans = 0;
		for (int i = 0; i <= n; i++) {
			ans += ((i + 1) * i) / 2;
		}
		System.out.println(ans);
		reader.close();
	}

}
