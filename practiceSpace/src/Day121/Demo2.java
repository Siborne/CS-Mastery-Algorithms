package Day121;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Demo2 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	private static final int MAXN = (int) 1e5 + 10;

	private static int N, K;
	private static long sum, cnt;
	private static int[] arr;
	private static long[] v = new long[MAXN];

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			N = (int) st.nval;
			st.nextToken();
			K = (int) st.nval;
			arr = new int[N];
			sum = 0;
			cnt = 0;
			for (int i = 0; i < N; i++) {
				st.nextToken();
				arr[i] = (int) st.nval;
				sum += arr[i];
				v[(int) (sum % K)]++;
			}
			cnt += v[0];
			for (int i = 0; i < K; i++) {
				cnt += (v[i] * (v[i] - 1)) / 2;
			}
			writer.println(cnt);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
