package Day94;

import java.util.Scanner;

public class Demo8 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int x = reader.nextInt();
		int ans = 0;
		while (x != 0) {
			ans += x % 10;
			x /= 10;
		}
		System.out.println(ans);
		reader.close();
	}

}
