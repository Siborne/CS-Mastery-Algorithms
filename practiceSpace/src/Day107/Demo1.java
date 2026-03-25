package Day107;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Demo1 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		String s = reader.readLine();
		if (s == null) {
			return;
		}
		s = s.trim();
		if (s.isEmpty()) {
			return;
		}
		BigDecimal x = new BigDecimal(s);
		BigDecimal denom = new BigDecimal("23");

		BigDecimal res = x.divide(denom, 8, RoundingMode.HALF_UP);
		writer.println(res.toPlainString());

		writer.flush();
	}

}
