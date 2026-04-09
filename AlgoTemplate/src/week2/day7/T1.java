package week2.day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class T1 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		String line = reader.readLine();
		int left = 0;
		int right = line.length() - 1;
		boolean flag = true;
		while (left < right) {
			if (line.charAt(left) != line.charAt(right)) {
				flag = false;
				break;
			}
			left++;
			right--;
		}
		writer.println(flag ? "yes" : "no");
		writer.flush();
		writer.close();
		reader.close();
	}

}
