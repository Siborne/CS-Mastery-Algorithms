package Part1;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class T1001 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static long n;
	private static long ans;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (long) st.nval;
			ans = n * (n + 1) / 2;
			writer.println(ans);
			writer.println();
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
