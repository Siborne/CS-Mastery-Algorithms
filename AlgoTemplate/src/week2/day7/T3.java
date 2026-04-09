package week2.day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class T3 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	private static String s;

	public static void main(String[] args) throws IOException {
		s = reader.readLine();
		int len = s.length();
		int l = 0;
		int r = len - 1;
		int pair = 0;
//		System.out.println("start");
		while (l < r) {
			while (l < r && s.charAt(l) != 'A') {
				l++;
			}
//			System.out.println("search A");
			while (l < r && s.charAt(r) != 'B') {
				r--;
			}
//			System.out.println("search B");
			if (s.charAt(l) == 'A' && s.charAt(r) == 'B') {
				pair++;
			}
			l++;
			r--;
		}
//		System.out.println("end");
		writer.println(len - pair * 2);
		writer.flush();
		writer.close();
		reader.close();
	}

}
