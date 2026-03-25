package class054;

public class Code02_LongestSubarrayAbsoluteLimit {

	private static int MAXN = (int) 1e5 + 1;

	private static int[] maxDeque = new int[MAXN];
	private static int[] minDeque = new int[MAXN];

	private static int maxHead, maxTail, minHead, minTail;

	private static int[] arr;

	public int longestSubarray(int[] nums, int limit) {
		maxHead = maxTail = minHead = minTail = 0;
		int n = nums.length;
		int ans = 0;
		arr = nums;
		for (int l = 0, r = 0; l < nums.length; l++) {
			while (r < n && isOk(limit, nums[r])) {
				push(r++);
			}
			ans = Math.max(ans, r - l);
			pop(l);
		}
		return ans;
	}

	private static boolean isOk(int limit, int number) {
		int max = maxHead < maxTail ? Math.max(arr[maxDeque[maxHead]], number) : number;
		int min = minHead < minTail ? Math.min(arr[minDeque[minHead]], number) : number;
		return max - min <= limit;
	}

	private static void pop(int l) {
		if (maxHead < maxTail && maxDeque[maxHead] == l) {
			maxHead++;
		}
		if (minHead < minTail && minDeque[minHead] == l) {
			minHead++;
		}
	}

	private static void push(int r) {
		while (maxHead < maxTail && arr[maxDeque[maxTail - 1]] <= arr[r]) {
			maxTail--;
		}
		maxDeque[maxTail++] = r;
		while (minHead < minTail && arr[minDeque[minTail - 1]] >= arr[r]) {
			minTail--;
		}
		minDeque[minTail++] = r;
	}

}
