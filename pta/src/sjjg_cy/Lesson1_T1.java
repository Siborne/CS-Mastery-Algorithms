package sjjg_cy;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Lesson1_T1 {
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	private static int K, x;
	private static long ans, sum;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			K = (int) st.nval;
			ans = Long.MIN_VALUE;
			sum = 0;
			for (int i = 0; i < K; i++) {
				st.nextToken();
				x = (int) st.nval;
				sum += x;
				if (sum <= 0) {
					sum = 0;
				} else {
					ans = Math.max(ans, sum);
				}
			}
			System.out.println(ans);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
