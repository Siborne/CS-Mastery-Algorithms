package Day98;

import java.util.Scanner;

public class Demo21 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int k = reader.nextInt();
		long ans = 0;
		if (n < k || k == 1) {
			ans = n;
		} else
			while (n != 0) {
				if (n % k != 0) {
					n--;
				} else {
					n /= k;
				}
				ans++;
			}
		System.out.println(ans);
		reader.close();
	}

}
