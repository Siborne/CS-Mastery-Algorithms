package class054;

public class Code01_SlidingWindowMaximum {

	private static int MAXN = (int) 1e5 + 1;

	private static int[] deque = new int[MAXN];

	private static int head, tail;

	public int[] maxSlidingWindow(int[] nums, int k) {
		head = tail = 0;
		int n = nums.length;
		for (int i = 0; i < k - 1; i++) {
			while (head < tail && nums[deque[tail - 1]] <= nums[i]) {
				tail--;
			}
			deque[tail++] = i;
		}
		int m = n - k + 1;
		int[] ans = new int[m];
		for (int l = 0, r = k - 1; l < m; l++, r++) {
			while (head < tail && nums[deque[tail - 1]] <= nums[r]) {
				tail--;
			}
			deque[tail++] = r;
			ans[l] = nums[deque[head]];
			if (deque[head] == l) {
				head++;
			}
		}
		return ans;
	}
}
