package Day105;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Demo6 {

	private static BufferedReader reader;
	private static StreamTokenizer st;
	private static PrintWriter writer;
	private static Set<Integer> set1, set2;

	static {
		reader = new BufferedReader(new InputStreamReader(System.in));
		st = new StreamTokenizer(reader);
		writer = new PrintWriter(new OutputStreamWriter(System.out));
		set1 = new HashSet<>();
		set2 = new HashSet<>();
	}

	private static int n;

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			n = (int) st.nval;
			set1.clear();
			set2.clear();
			for (int i = 0; i < n; i++) {
				st.nextToken();
				set1.add((int) st.nval);
			}
			for (int i = 0; i < n; i++) {
				st.nextToken();
				set2.add((int) st.nval);
			}
			if (set1.equals(set2)) {
				writer.println("YES");
			} else {
				writer.println("NO");
			}
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
