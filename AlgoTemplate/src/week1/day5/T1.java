package week1.day5;

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

	private static int n;
	private static int max;
	private static int min;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			max = Integer.MIN_VALUE;
			min = Integer.MAX_VALUE;
			int sum = 0;
			n = (int) st.nval;
			for (int i = 0; i < n; i++) {
				st.nextToken();
				int x = (int) st.nval;
				sum += x;
				max = Math.max(max, x);
				min = Math.min(min, x);
				if (i >= 2) {
					writer.println(String.format("%.2f", (double) (sum - max - min) / (i - 1)));
				}
			}
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
