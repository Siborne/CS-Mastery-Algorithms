package Day105;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class Demo1 {

	private static BufferedReader reader;
	private static StreamTokenizer st;
	private static PrintWriter writer;

	static {
		reader = new BufferedReader(new InputStreamReader(System.in));
		st = new StreamTokenizer(reader);
		writer = new PrintWriter(new OutputStreamWriter(System.out));
	}
	private static final int MAXN = 4;
	private static final int[] arr = new int[MAXN];

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			arr[0] = (int) st.nval;
			for (int i = 1; i < MAXN; i++) {
				st.nextToken();
				arr[i] = (int) st.nval;
			}
			Arrays.sort(arr);
			StringBuilder sb = new StringBuilder();
			for (int i = MAXN - 1; i >= 0; i--) {
				sb.append(arr[i]);
			}
			writer.println(Integer.parseInt(sb.toString()));
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
