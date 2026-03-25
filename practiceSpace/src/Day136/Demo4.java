package Day136;

public class Demo4 {

	private static final int MAXN = (int) 1e5 + 1;

	private static int[] deque = new int[MAXN];

	private static int head, tail;

	public int[] maxSlidingWindow(int[] nums, int k) {
		int len = nums.length;
		head = tail = 0;

		for (int i = 0; i < k - 1; i++) {
			while (head < tail && nums[deque[tail - 1]] <= nums[i]) {
				tail--;
			}
			deque[tail++] = i;
		}

		int m = len - k + 1;
		int[] res = new int[m];
		for (int l = 0, r = k - 1; l < m; l++, r++) {
			while (head < tail && nums[deque[tail - 1]] <= nums[r]) {
				tail--;
			}
			deque[tail++] = r;
			res[l] = nums[deque[head]];
			if (deque[head] == l) {
				head++;
			}
		}

		return res;
	}

}
