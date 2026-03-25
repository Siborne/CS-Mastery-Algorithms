package Day108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;

public class Demo2 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		String line = reader.readLine();
		int n = line.length();

		char[] stack = new char[105];
		int[] pos = new int[105];
		char[] need = new char[105];
		int top = 0;

		Arrays.fill(need, ' ');
		for (int i = 0; i < n; i++) {
			char ch = line.charAt(i);
			if (ch == '(' || ch == '[') {
				top++;
				stack[top] = ch;
				pos[top] = i;
				if (ch == '(') {
					need[i] = ')';
				} else {
					need[i] = ']';
				}
			} else if (ch == ')') {
				if (top > 0 && stack[top] == '(') {
					need[pos[top]] = ' ';
					top--;
				} else {
					need[i] = '(';
				}
			} else if (ch == ']') {
				if (top > 0 && stack[top] == '[') {
					need[pos[top]] = ' ';
					top--;
				} else {
					need[i] = '[';
				}
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			char ch = line.charAt(i);
			if (need[i] == '(' || need[i] == '[') {
				sb.append(need[i]).append(ch);
			} else if (need[i] == ')' || need[i] == ']') {
				sb.append(ch).append(need[i]);
			} else {
				sb.append(ch);
			}
		}
		writer.println(sb.toString());
		writer.flush();
		writer.close();
		reader.close();
	}

}
