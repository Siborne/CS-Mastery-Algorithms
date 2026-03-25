package Day133;

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

	private static int n;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;
			String res = tenTo2(n);
			writer.println(res);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static String tenTo2(int n) {
		StringBuilder sb = new StringBuilder();
		while (n!=0) {
			sb.append(n%2);
			n/=2;
		}
		return sb.reverse().toString();
	}

}
