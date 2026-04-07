package week2.day1;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class T4 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			int T = (int) st.nval;
			while (T-- > 0) {
				st.nextToken();
				int a = (int) st.nval;
				st.nextToken();
				int b = (int) st.nval;
				if ((a == 1 && b == 2) || (a == 2 && b == 1)) {
					writer.println("Yes");
				} else {
					writer.println("No");
				}
			}
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
