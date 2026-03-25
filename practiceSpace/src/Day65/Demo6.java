package Day65;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int n = reader.nextInt();
			int ans = 0;
			int sum = 0;
			while (n-- > 0) {
				int x = reader.nextInt();
				if (x == 1) {
					ans = Math.max(sum, ans);
					sum = 0;
				}else {
					sum++;
				}
			}
			ans = Math.max(sum, ans);
			System.out.println(ans);
		}

		reader.close();
	}

}
