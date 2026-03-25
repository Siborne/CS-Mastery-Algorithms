package Day110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.HashSet;
import java.util.Set;

public class Demo4 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	private static long T, n, temp, cnt, length;
	private static Set<Integer> digits = new HashSet<>();

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			T = (int) st.nval;
			while (T-- > 0) {
				st.nextToken();
				n = (long) st.nval;
				temp = n;
				digits.clear();
				while (temp != 0) {
					digits.add((int) (temp % 10));
					temp /= 10;
				}

				boolean allDivide = true;
				boolean noneDivide = true;

				for (int d : digits) {
					if (d == 0) {
						noneDivide = false;
					} else {
						if (n % d == 0) {
							noneDivide = false;
						} else {
							allDivide = false;
						}
					}
				}

				if (allDivide) {
					writer.println("G");
				} else if (noneDivide) {
					writer.println("S");
				} else {
					writer.println("H");
				}

			}
		}
		writer.flush();
		writer.close();
		reader.close();
	}
}
