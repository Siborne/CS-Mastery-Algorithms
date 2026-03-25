package Day127;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int ans;
		if (n == 1) {
			ans = 1;
		} else {
			ans = (int) Math.pow(2, n) - 1;
		}

		System.out.println(ans);

		reader.close();
	}

}
