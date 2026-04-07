package week2.day2;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class T3 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			st.nextToken();
			int m = (int) st.nval;
			int[] arr = new int[n];
			int[] brr = new int[n + 1];
			for (int i = 0; i < arr.length; i++) {
				st.nextToken();
				arr[i] = (int)st.nval;
				brr[i + 1] = brr[i] ^ arr[i];
			}
			while (m-- > 0) {
				st.nextToken();
				int l = (int) st.nval - 1;
				st.nextToken();
				int r = (int) st.nval;
				writer.println(brr[r] ^ brr[l]);
			}
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
