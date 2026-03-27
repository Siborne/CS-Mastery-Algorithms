package week1.day5;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class T4 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	private static final char[][] target;

	static {
		target = new char[][] { { '0', '0', '0', '0' }, { '0', '1', '1', '0' }, { '0', '1', '1', '0' },
				{ '0', '0', '0', '0' } };
	}

	public static void main(String[] args) throws IOException {
		int t = Integer.parseInt(reader.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			if (n < 4 || m < 4) {
				for (int i = 0; i < n; i++) {
					reader.readLine();
				}
				writer.println("No");
				continue;
			}
			String[] line = new String[n];
			for (int i = 0; i < line.length; i++) {
				line[i] = reader.readLine();
			}
			boolean flag = false;
			for (int i = 0; i < n - 4; i++) {
				for (int j = 0; j < m - 4; j++) {
					if (check(line, i, j)) {
						flag = true;
						break;
					}
				}
			}
			writer.println(flag ? "Yes" : "No");
		}
		writer.flush();
		writer.close();
		reader.close();
	}

	private static boolean check(String[] lines, int x, int y) {
		for (int i = 0; i < 4; i++) {
			char[] chs = lines[x + i].toCharArray();
			for (int j = 0; j < 4; j++) {
				if (chs[y + j] != target[i][j]) {
					return false;
				}
			}
		}
		return true;
	}

}
