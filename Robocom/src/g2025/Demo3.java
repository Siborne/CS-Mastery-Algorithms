package g2025;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Demo3 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	private static int m, n;
	private static int[] arr, brr;

	public static void main(String[] args) throws IOException {
//		while (st.nextToken() != StreamTokenizer.TT_EOF) {
		st.nextToken();
		m = (int) st.nval;
		while (m-- > 0) {
			st.nextToken();
			n = (int) st.nval;
			arr = new int[n];
			brr = new int[n];
			for (int i = 0; i < n; i++) {
				st.nextToken();
				arr[i] = (int) st.nval;
			}
			for (int i = 0; i < n; i++) {
				st.nextToken();
				brr[i] = (int) st.nval;
			}
			writer.println(1);

		}
//		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
