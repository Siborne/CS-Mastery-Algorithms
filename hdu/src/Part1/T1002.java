package Part1;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;

public class T1002 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));
	private static String[] strs;
	private static int T;
	private static BigInteger num1, num2, sum;

	public static void main(String[] args) throws IOException {
		T = Integer.parseInt(reader.readLine());
		for (int i = 1; i <= T; i++) {
			strs = reader.readLine().split("\\s+");
			num1 = new BigInteger(strs[0]);
			num2 = new BigInteger(strs[1]);
			sum = num1.add(num2);
			StringBuilder line = new StringBuilder();
			line.append(num1).append(" + ").append(num2).append(" = ").append(sum);
			writer.println("Case " + i + ":");
			writer.println(line.toString());
			writer.println();
		}

		writer.flush();
		writer.close();
		reader.close();
	}

}
