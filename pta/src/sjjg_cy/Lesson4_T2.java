package sjjg_cy;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Lesson4_T2 {

	private static BufferedReader reader;
	private static StreamTokenizer st;
	private static PrintWriter writer;

	static {
		reader = new BufferedReader(new InputStreamReader(System.in));
		st = new StreamTokenizer(reader);
		writer = new PrintWriter(new BufferedOutputStream(System.out));
	}

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {

		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
