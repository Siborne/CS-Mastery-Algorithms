package week1.day5;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class T5 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(reader.readLine());

		for (int i = 0; i < n; i++) {
			String line = reader.readLine();
			if (canSplit(line)) {
				writer.println("Yes");
			} else {
				writer.println("No");
			}
		}

		writer.flush();
		writer.close();
		reader.close();
	}

	private static boolean canSplit(String line) {
		int len = line.length();

		for (int i = 2; i <= len - 2; i++) {
			String first = line.substring(0, i);
			String last = line.substring(i);

			if (isPalindrome(first) && isPalindrome(last)) {
				return true;
			}
		}
		return false;
	}

	private static boolean isPalindrome(String line) {
		int left = 0;
		int right = line.length() - 1;
		while (left < right) {
			if (line.charAt(left) != line.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

}
