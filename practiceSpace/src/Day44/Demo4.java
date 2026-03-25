package Day44;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		char[] chs = reader.nextLine().toCharArray();
		int n = chs.length;
		int[][] cnt = new int[4][4];
		for (int i = 0; i < n; i++) {
			int index = i % 4;
			if (chs[i] == 'b') {
				cnt[index][0]++;
			}
			if (chs[i] == 'l') {
				cnt[index][1]++;
			}
			if (chs[i] == 'u') {
				cnt[index][2]++;
			}
			if (chs[i] == 'e') {
				cnt[index][3]++;
			}
		}
		long res = 0;
		int index = 0;

		while (index <= n - 4) {
			boolean flag = cnt[index % 4][0] >= 1 && cnt[(index + 1) % 4][1] >= 1 && cnt[(index + 2) % 4][2] >= 1
					&& cnt[(index + 3) % 4][3] >= 1;
			if (flag) {
				res++;
				cnt[index % 4][0]--;
				cnt[(index + 1) % 4][1]--;
				cnt[(index + 2) % 4][2]--;
				cnt[(index + 3) % 4][3]--;
				index = index +4;
				continue;
			}
			index++;
		}

		System.out.println(res);
		reader.close();
	}

}
