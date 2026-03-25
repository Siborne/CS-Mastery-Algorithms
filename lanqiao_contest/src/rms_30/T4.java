package rms_30;

import java.util.Scanner;

public class T4 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		char[] chs = reader.nextLine().toCharArray();
		int len = chs.length;

		int k = 0;
		for (int i = 0; i < len - 1; i++) {
			if (chs[i] == 'Q' && chs[i + 1] == 'Q') {
				k++;
			}
		}

		int t = 0;
		for (int i = 0; i < len - 2; i++) {
			if (chs[i] == 'Q' && chs[i + 2] == 'Q' && chs[i + 1] != 'Q') {
				t++;
			}
		}

		int m = len - 1 - k;
		int base = k > 0 ? 1 : 0;
		int ans = base + (m - t);
		System.out.println(ans);
		reader.close();
	}
}
