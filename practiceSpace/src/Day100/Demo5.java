package Day100;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Demo5 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws IOException {

		st.nextToken();
		int n = (int) st.nval;
		int[] arr = new int[n];
		int[] brr = new int[n + 1];
		for (int i = 0; i < n; i++) {
			st.nextToken();
			arr[i] = (int) st.nval;
			brr[i + 1] = arr[i] + brr[i];
		}
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int l = (int) st.nval;
			st.nextToken();
			int r = (int) st.nval + 1;
			writer.println(brr[r] - brr[l]);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
