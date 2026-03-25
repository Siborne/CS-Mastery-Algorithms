package Part1;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.math.BigInteger;
import java.util.Scanner;

public class T1000 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));
	private static StreamTokenizer st = new StreamTokenizer(reader);
	private static String str, aStr, bStr;
	private static String[] strs;
	private static BigInteger a, b;

	public static void main(String[] args) throws IOException {
		while (true) {
			str = reader.readLine();
			if (str == null || str.equals("")) {
				break;
			}
			strs = str.split("\\s+");
			aStr = strs[0];
			bStr = strs[1];
			a = new BigInteger(aStr);
			b = new BigInteger(bStr);
			a = a.add(b);
			writer.println(a);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
