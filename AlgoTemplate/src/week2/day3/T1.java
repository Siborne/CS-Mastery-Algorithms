package week2.day3;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class T1 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			st.nextToken();
			int q = (int) st.nval;
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				st.nextToken();
				arr[i] = (int) st.nval;
			}
			
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
