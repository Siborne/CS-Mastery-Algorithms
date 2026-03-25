package Day104;

import java.util.Scanner;

public class Demo8 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		char[] chs = reader.nextLine().toCharArray();
		long ans = 0;
		for (int l = 0, r = chs.length - 1; l <= r; l++, r--) {
			if (chs[l] == chs[r]) {
				continue;
			}
			int a = chs[l] - 'a';
			int b = chs[r] - 'a';
			int minCost = Integer.MAX_VALUE;
			for (int t = 0; t < 26; t++) {
				int costA = (t - a + 26) % 26;
				int costB = (t - b + 26) % 26;
				int total = costA + costB;
				if (total < minCost) {
					minCost = total;
				}
			}
			ans += minCost;
		}
		System.out.println(ans);
		reader.close();
	}

}
