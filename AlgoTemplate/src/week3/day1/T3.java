package week3.day1;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class T3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		String line = reader.nextLine();

		Deque<Integer> stack = new ArrayDeque<>();
		for (char c : line.toCharArray()) {
			if (c == '.') {
				continue;
			} else if (c >= '0' && c <= '9') {
				stack.push((int) (c - '0'));
			} else if (c == '-') {
				int num1 = stack.pop();
				int num2 = stack.pop();
				stack.push(num2 - num1);
			} else if (c == '+') {
				int num1 = stack.pop();
				int num2 = stack.pop();
				stack.push(num2 + num1);
			} else if (c == '*') {
				int num1 = stack.pop();
				int num2 = stack.pop();
				stack.push(num2 * num1);
			} else if (c == '/') {
				int num1 = stack.pop();
				int num2 = stack.pop();
				stack.push(num2 / num1);
			} else {
				break;
			}
		}
		System.out.println(stack.pop());
		reader.close();
	}

}
