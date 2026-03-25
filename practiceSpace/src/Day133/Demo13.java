package Day133;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.math.BigInteger;

public class Demo13 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	private static int[] digits = new int[26 * 2];

	static {
		for (int i = 0; i < digits.length - 26; i++) {
			digits[i] = i + 1;
		}
		for (int i = 26; i < digits.length; i++) {
			digits[i] = digits[i - 26] * -1;
		}
	}

	private static int n;

	public static void main(String[] args) throws IOException {
		n = Integer.parseInt(reader.readLine());
		while (n-- > 0) {
			String[] parts = reader.readLine().split("\\s+");
			char letter = parts[0].charAt(0);
			long num = Long.parseLong(parts[1]);
			if (Character.isLowerCase(letter)) {
				num += digits[letter - 'a' + 26];
			} else if (Character.isUpperCase(letter)) {
				num += digits[letter - 'A'];
			}
			writer.println(num);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
