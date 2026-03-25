package Day148;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class Demo2 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		int t = Integer.parseInt(reader.readLine());
		while (t-- > 0) {
			String line = reader.readLine();
			int len = line.length();
			if ((len & 1) == 1) {
				writer.println("-1");
			} else {
				if (len == 2) {
					writer.println("()");
				} else {
					writer.println("There are multiple solutions");
				}
			}
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
