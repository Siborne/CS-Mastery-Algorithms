package class055;

public class Code01_ShortestSubarrayWithSumAtLeastK {

	private static final int MAXN = (int) 1e5 + 1;

	private static int[] deque = new int[MAXN];
	private static long[] sum = new long[MAXN];

	private static int head, tail;

	public int shortestSubarray(int[] nums, int k) {
		head = tail = 0;
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			sum[i + 1] = sum[i] + nums[i];
		}
		int ans = Integer.MAX_VALUE;

		for (int i = 0; i <= n; i++) {
			while (head != tail && sum[i] - sum[deque[head]] >= k) {
				ans = Math.min(ans, i - deque[head++]);
			}
			while (head != tail && sum[deque[tail - 1]] >= sum[i]) {
				tail--;
			}
			deque[tail++] = i;
		}

		return ans == Integer.MAX_VALUE ? -1 : ans;
	}

}
