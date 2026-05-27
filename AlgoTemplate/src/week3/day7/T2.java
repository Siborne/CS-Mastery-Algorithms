package week3.day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.List;

public class T2 {

	private static List<String> ans = new ArrayList<>();
	private static int[] digits = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

	private static int a, b, c;

	private static void check() {
		int num1 = digits[0] * 100 + digits[1] * 10 + digits[2];
		int num2 = digits[3] * 100 + digits[4] * 10 + digits[5];
		int num3 = digits[6] * 100 + digits[7] * 10 + digits[8];
		if (num1 * b == num2 * a && num1 * c == num3 * a && num2 * c == num3 * b) {
			ans.add(num1 + " " + num2 + " " + num3);
		}
	}

	private static void dfs(int pos) {
		if (pos == 9) {
			check();
			return;
		}

		for (int i = pos; i < digits.length; i++) {
			int temp = digits[pos];
			digits[pos] = digits[i];
			digits[i] = temp;

			dfs(pos + 1);

			temp = digits[pos];
			digits[pos] = digits[i];
			digits[i] = temp;
		}
	}

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		while (st.nextToken() != StreamTokenizer.TT_EOF) {
			a = (int) st.nval;
			st.nextToken();
			b = (int) st.nval;
			st.nextToken();
			c = (int) st.nval;
			dfs(0);
			if (ans.isEmpty() || ans == null) {
				writer.println("No!!!");
			} else {
				for (String line : ans) {
					writer.println(line);
				}
			}
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
