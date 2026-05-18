package week2.day8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class T3 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				st.nextToken();
				arr[i] = (int) st.nval;
			}
			long ans = 0;
			long mask = 0;
			int l = 0;

			for (int r = 0; r < n; r++) {
				while ((mask & arr[r]) != 0) {
					mask ^= arr[l++];
				}
				mask |= arr[r];
				ans += r - l + 1;
			}
			writer.println(ans);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
