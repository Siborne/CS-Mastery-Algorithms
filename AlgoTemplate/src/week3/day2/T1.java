package week3.day2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class T1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		Deque<Integer> deque = new ArrayDeque<>();
		for (int i = 1; i <= n; i++) {
			deque.addLast(i);
		}

		int[] ans = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			ans[deque.pollFirst()] = i;
			if (deque.isEmpty()) {
				break;
			}
			deque.addLast(deque.pollFirst());
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= n; i++) {
			sb.append(ans[i]).append(' ');
		}
		System.out.println(sb.toString().trim());

		reader.close();
	}

}
