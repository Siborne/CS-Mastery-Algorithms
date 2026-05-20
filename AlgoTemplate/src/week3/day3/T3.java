package week3.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class T3 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	private static int[] bit;
	private static int n;

	private static void add(int x) {
		for (; x <= n; x += x & -x) {
			bit[x]++;
		}
	}

	private static int query(int x) {
		int res = 0;
		for (; x > 0; x -= x & -x) {
			res += bit[x];
		}
		return res;
	}

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;

			int[] cnt = new int[n + 2];

			for (int i = 0; i < n; i++) {
				st.nextToken();
				cnt[(int) st.nval]++;
			}

			Integer[] ids = new Integer[n];
			for (int i = 0; i < ids.length; i++) {
				ids[i] = i + 1;
			}
			Arrays.sort(ids, (a, b) -> cnt[b] - cnt[a]);

			bit = new int[n + 2];
			long ans = 0;
			int j = 0;

			for (int a = n; a >= 1; a--) {
				while (j < n && cnt[ids[j]] >= a) {
					add(ids[j]);
					j++;
				}
				ans += query(cnt[a]);
			}

			writer.println(ans);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
