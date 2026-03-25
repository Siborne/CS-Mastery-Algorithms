package Day107;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Deque;
import java.util.LinkedList;

public class Demo8 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	private static char[] chs;
	private static Deque<Integer> stack = new LinkedList<>();
	private static int ans, temp;

	public static void main(String[] args) throws IOException {
		chs = reader.readLine().toCharArray();

		for (int i = 0; i < chs.length; i++) {
			if (chs[i] == '@') {
				ans = stack.poll();
				break;
			}
			if (chs[i] == '.') {
				continue;
			}
			if (chs[i] == '/') {
				int b = stack.poll();
				int a = stack.poll();
				a = a / b;
				stack.push(a);
			} else if (chs[i] == '*') {
				int b = stack.poll();
				int a = stack.poll();
				a = a * b;
				stack.push(a);
			} else if (chs[i] == '-') {
				int b = stack.poll();
				int a = stack.poll();
				a = a - b;
				stack.push(a);
			} else if (chs[i] == '+') {
				int b = stack.poll();
				int a = stack.poll();
				a = a + b;
				stack.push(a);
			} else {
				temp = 0;
				while (chs[i] >= '0' && chs[i] <= '9') {
					temp = temp * 10 + chs[i] - '0';
					i++;
				}
				i--;
				stack.push(temp);
			}
		}
		writer.println(ans);
		writer.flush();
		writer.close();
		reader.close();
	}

}