package week2.day2;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.StringTokenizer;

public class T6 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		String s = reader.readLine();

		long ans = 0;

		for (int m = 1; m <= 26; m++) {
			int len = m * k;

			if (len > n) {
				break;
			}
			int[] cnt = new int[26];
			int validKinds = 0;
			int totalKinds = 0;
			for (int i = 0; i < len; i++) {
				int c = s.charAt(i) - 'a';
				cnt[c]++;
			}

			for (int i = 0; i < 26; i++) {
				if (cnt[i] > 0) {
					totalKinds++;
				}
				if (cnt[i] == k) {
					validKinds++;
				}
			}

			if (totalKinds == m && validKinds == m) {
				ans++;
			}

			for (int i = len; i < n; i++) {
				int right = s.charAt(i) - 'a';
				if (cnt[right] == 0) {
					totalKinds++;
				}
				if (cnt[right] == k) {
					validKinds--;
				}
				cnt[right]++;
				if (cnt[right] == k) {
					validKinds++;
				}
				int left = s.charAt(i - len) - 'a';
				if (cnt[left] == k) {
					validKinds--;
				}
				cnt[left]--;
				if (cnt[left] == k) {
					validKinds++;
				}
				if (cnt[left] == 0) {
					totalKinds--;
				}
				if (totalKinds == m && validKinds == m) {
					ans++;
				}
			}	
		}
		writer.println(ans);
		writer.flush();
		writer.close();
		reader.close();
	}

}
