package Day127;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Demo9 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) st.nval;
			long sum = 0;

			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < n; i++) {
				st.nextToken();
				int score = (int) st.nval;
				sum += score;
				if (score < min)
					min = score;
				if (score > max)
					max = score;

				if (i >= 2) {
					double avg = (double) (sum - min - max) / (i - 1);
					writer.println(String.format("%.2f", avg));
				}

			}

		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
