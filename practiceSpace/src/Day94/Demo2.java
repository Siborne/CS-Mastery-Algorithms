package Day94;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String[] strs = reader.nextLine().split("\\,");
		int n = Integer.parseInt(strs[0]);
		int N = Integer.parseInt(strs[1]);
		int ans = 0;
		for (int i = n; i <= N; i++) {
			if (i % 2 == 0 && i % 3 == 0) {
				ans += i;
			}
		}
		System.out.println(ans);
		reader.close();
	}

}
