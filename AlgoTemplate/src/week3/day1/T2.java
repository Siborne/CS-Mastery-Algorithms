package week3.day1;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class T2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		String s = reader.nextLine();
		StringBuilder sb = new StringBuilder();
		Deque<Character> stack = new ArrayDeque<>();

		for (char c : s.toCharArray()) {
			if (c >= '0' && c <= '9') {
				sb.append(c).append(".");
			} else if (c == '(') {
				stack.push(c);
			} else if (c == ')') {
				while (!stack.isEmpty() && stack.peek() != '(') {
					sb.append(stack.pop());
				}
				stack.pop();
			} else {
				while (!stack.isEmpty() && stack.peek() != '(' && priority(stack.peek()) >= priority(c)) {
					sb.append(stack.pop());
				}
				stack.push(c);
			}
		}

		while (!stack.isEmpty()) {
			sb.append(stack.pop());
		}

		System.out.println(sb.toString());
		reader.close();
	}

	private static int priority(char op) {
		if (op == '*' || op == '/') {
			return 2;
		}
		if (op == '+' || op == '-') {
			return 1;
		}
		return 0;
	}

}
