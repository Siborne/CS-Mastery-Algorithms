package Day105;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class Demo5 {

	private static BufferedReader reader;
	private static StreamTokenizer st;
	private static PrintWriter writer;

	static {
		reader = new BufferedReader(new InputStreamReader(System.in));
		st = new StreamTokenizer(reader);
		writer = new PrintWriter(new OutputStreamWriter(System.out));
	}

	private static int n, m;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;
			st.nextToken();
			m = (int) st.nval;
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				st.nextToken();
				arr[i] = (int) st.nval;
			}
			Arrays.sort(arr);
			int ans = 0;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i + 1] - arr[i] < m) {
					ans++;
					i++;
				}
			}
			writer.println(ans);
		}
		writer.flush();
		writer.close();
		reader.close();
	}
	
}
