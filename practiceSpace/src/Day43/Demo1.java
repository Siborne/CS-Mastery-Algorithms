package Day43;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Demo1 {

	private static char[] chs;

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		String numStr = reader.nextLine();
		int length = numStr.length();
		chs = numStr.toCharArray();
		int sum = 0;
		int l = 0;
		int r = 9;
		int res = 100;
		for (; r < length; r++, l++) {
			int[] arr = new int[10];
			Queue<Integer> q1 = new PriorityQueue<>();
			Queue<Integer> q2 = new PriorityQueue<>();
			int min = 0;
			for (int j = l; j <= r; j++) {
				arr[chs[j] - '0']++;
			}
			for (int k = 0; k <= 9; k++) {
				if (arr[k] == 0) {
					q2.add(k);
				}
				if (arr[k] > 1) {
					for (int j = 0; j < arr[k] - 1; j++) {
						q1.add(k);
					}
				}
			}
			if (q2.isEmpty()) {
				res = 0;
				break;
			}
			while (!q1.isEmpty()) {
				min += Math.abs(q1.poll() - q2.poll());
			}
			if (min < res) {
				res = min;
			}
		}
		System.out.println(res);
		reader.close();
	}

}
