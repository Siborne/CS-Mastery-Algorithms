package Day104;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Demo14 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int n = reader.nextInt();
			int k = reader.nextInt();
			long[] arr = new long[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = reader.nextLong();
			}

			long[] dp = new long[n + 1];
			dp[0] = 0;
			Deque<Integer> dq = new LinkedList<>();

			dq.offer(0);

			for (int i = 1; i <= n; i++) {
				int left = i - k - 1;
				while (!dq.isEmpty() && dq.peekFirst() <= left) {
					dq.pollFirst();
				}

				long option1 = dp[i - 1] + arr[i - 1];
				long option2 = dp[dq.peekFirst()];
				dp[i] = Math.max(option1, option2);

				while (!dq.isEmpty() && dp[dq.peekLast()] <= dp[i]) {
					dq.pollLast();
				}
				dq.offer(i);
			}
			System.out.println(dp[n]);

		}

		reader.close();
	}

}
