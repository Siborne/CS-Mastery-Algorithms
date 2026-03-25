package Day87;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Demo3 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws IOException {
		int t = Integer.parseInt(reader.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			int n = Integer.parseInt(st.nextToken());
			int q = Integer.parseInt(st.nextToken());
			boolean[][] dp = new boolean[26][26];
			char[][] a = new char[n][2];
			st = new StringTokenizer(reader.readLine());
			for (int i = 0; i < n; i++) {
				String s = st.nextToken();
				char l = s.charAt(0);
				char r = s.charAt(s.length() - 1);
				dp[l - 'a'][r - 'a'] = true;
				a[i][0] = l;
				a[i][1] = r;
			}

			for (int k = 0; k < 26; k++) {
				for (int i = 0; i < n; i++) {
					int l = a[i][0] - 'a';
					int r = a[i][1] - 'a';
					for (int j = 0; j < 26; j++) {
						if (dp[j][l]) {
							dp[j][r] = true;
						}
					}
				}
			}
			while (q-- > 0) {
				st = new StringTokenizer(reader.readLine());
				char l = st.nextToken().charAt(0);
				char r = st.nextToken().charAt(0);
				writer.println(dp[l - 'a'][r - 'a'] ? "Yes" : "No");
			}

		}

		writer.flush();
		writer.close();
		reader.close();
	}

}
