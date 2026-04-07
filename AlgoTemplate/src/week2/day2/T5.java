package week2.day2;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class T5 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			st.nextToken();
			int x = (int) st.nval;
			
			int[] cnt = new int[1 << 20];
			cnt[0] = 1;
			long ans = 0;
			int prefix = 0;
			
			for (int i = 0; i < n; i++) {
				st.nextToken();
				int a = (int) st.nval;
				prefix ^= a;

				int need = prefix ^ x;
				if (need < (1 << 20)) {
					ans += cnt[need];
				}
				cnt[prefix]++;
			}
			
			writer.println(ans);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
