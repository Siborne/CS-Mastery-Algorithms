package week2.day1;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class T5 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws IOException {
		int x = Integer.parseInt(reader.readLine());
		boolean flag = false;
		for (int y = 1; y <= 2025; y++) {
			if ((x & y) + (x | y) == 2025) {
				flag = true;
				writer.println(y);
				break;
			}
		}
		if (!flag) {
			writer.println(-1);
		}
		writer.flush();
		writer.close();
		reader.close();
	}

}
