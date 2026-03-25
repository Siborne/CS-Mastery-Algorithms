package Day130;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Demo9 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	private static String line;
	private static List<String> lines;

	public static void main(String[] args) throws IOException {
		lines = new ArrayList<>();
		while ((line = reader.readLine()) != null) {
			lines.add(line);
		}

		int m = lines.size();
		int s = String.valueOf(m).length();

		for (int i = 1; i <= m; i++) {
			int lineNumber = i;
			String numStr = String.valueOf(lineNumber);
			int leadingSpaces = s - numStr.length();

			StringBuilder prefix = new StringBuilder();
			while (leadingSpaces-- > 0) {
				prefix.append(' ');
			}
			prefix.append(numStr).append(' ');

			writer.print(prefix);
			writer.println(lines.get(i - 1));
		}

		writer.flush();
		writer.close();
		reader.close();
	}

}
