package sjjg_cy;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.HashMap;
import java.util.Map;

public class Lesson6_T1 {
	private static BufferedReader reader;
	private static StreamTokenizer st;
	private static PrintWriter writer;

	static {
		reader = new BufferedReader(new InputStreamReader(System.in));
		st = new StreamTokenizer(reader);
		writer = new PrintWriter(new BufferedOutputStream(System.out));
	}

	private static int n, m;
	private static boolean[][] graph;
	private static boolean[] visited;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;
			st.nextToken();
			m = (int) st.nval;

			graph = new boolean[n][n];
			visited = new boolean[n];

			for (int i = 0; i < m; i++) {
				
			}

		}
		writer.flush();
		writer.close();
		reader.close();
	}
}
