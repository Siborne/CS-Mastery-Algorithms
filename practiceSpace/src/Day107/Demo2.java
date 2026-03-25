package Day107;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Demo2 {
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		String s = reader.readLine();
		BigDecimal res = BigDecimal.ZERO;
		if (s == null) {
			res = res.setScale(5, RoundingMode.HALF_UP);
			writer.println(res.toPlainString());
			writer.flush();
			return;
		}
		s = s.trim();
		if (s.isEmpty()) {
			res = res.setScale(5, RoundingMode.HALF_UP);
			writer.println(res.toPlainString());
			writer.flush();
			return;
		}
		String[] str = s.split("\\s+");
		for (String string : str) {
			res = res.add(new BigDecimal(string));
		}
		res = res.setScale(5, RoundingMode.HALF_UP);
		writer.println(res.toPlainString());

		writer.flush();
	}
}
