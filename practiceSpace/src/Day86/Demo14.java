package Day86;

import java.util.Scanner;

public class Demo14 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int ans = Integer.MIN_VALUE;
		int last = -1;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			int x = reader.nextInt();
			if (x != last) {
				last = x;
				temp++;
				ans = Math.max(temp, ans);
			} else {
				temp = 1;
			}
		}
		System.out.println(ans);
		reader.close();
	}

}
