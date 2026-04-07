package week2.day1;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class T1 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(reader.readLine());
		while (n-- > 0) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			String A = st.nextToken();
			long B = Long.parseLong(st.nextToken());

			List<Long> validResults = new ArrayList<>();

			int[] bases = { 2, 4, 8, 16 };
			for (int base : bases) {
				Long val = convert(A, base);
				if (val != null && val <= B) {
					validResults.add(val);
				}
			}

			if (validResults.size() == 1) {
				writer.println(validResults.get(0));
			} else {
				writer.println(-1);
			}

		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static Long convert(String s, int base) {
		long result = 0;
		for (char c : s.toCharArray()) {
			int digit;
			if (c >= '0' && c <= '9') {
				digit = c - '0';
			} else if (c >= 'A' && c <= 'F') {
				digit = c - 'A' + 10;
			} else {
				return null;
			}

			if (digit >= base) {
				return null;
			}

			result = result * base + digit;
			if (result > 1e10) {
				return null;
			}
		}
		return result;
	}
}
