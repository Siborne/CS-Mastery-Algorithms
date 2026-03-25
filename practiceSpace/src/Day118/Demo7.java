package Day118;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Demo7 {

	private static BufferedReader reader;
	private static StreamTokenizer st;
	private static PrintWriter wrtier;

	static {
		reader = new BufferedReader(new InputStreamReader(System.in));
		st = new StreamTokenizer(reader);
		wrtier = new PrintWriter(new OutputStreamWriter(System.out));
	}

	private static int t, n, idx, res;
	private static String s;
	private static char c;
	private static int[] prefix, suffix;
	private static boolean[] seenPrefix, seenSuffix;

	public static void main(String[] args) throws IOException {
		t = Integer.parseInt(reader.readLine());
		while (t-- > 0) {
			n = Integer.parseInt(reader.readLine());
			s = reader.readLine();

			prefix = new int[n + 1];
			seenPrefix = new boolean[26];
			for (int i = 1; i <= n; i++) {
				c = s.charAt(i - 1);
				idx = c - 'a';
				prefix[i] = prefix[i - 1] + (seenPrefix[idx] ? 0 : 1);
				seenPrefix[idx] = true;
			}

			suffix = new int[n + 1];
			seenSuffix = new boolean[26];
			for (int i = n - 1; i >= 0; i--) {
				c = s.charAt(i);
				idx = c - 'a';
				suffix[i] = suffix[i + 1] + (seenSuffix[idx] ? 0 : 1);
				seenSuffix[idx] = true;
			}

			res = 0;
			for (int i = 1; i <= n - 1; i++) {
				res = Math.max(res, prefix[i] + suffix[i]);
			}
			wrtier.println(res);
		}
		wrtier.flush();
		wrtier.close();
		reader.close();
	}

}
