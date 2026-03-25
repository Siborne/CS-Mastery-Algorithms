package Day103;

import java.util.Scanner;

public class Demo11 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int ans = 0;
		while (n > 0) {
			ans += n % 10;
			n /= 10;
		}
		System.out.println(ans);
		reader.close();
	}

}

