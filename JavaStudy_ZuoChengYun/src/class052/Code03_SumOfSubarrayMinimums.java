package class052;

public class Code03_SumOfSubarrayMinimums {

	private static final int MOD = (int) 1e9 + 7;
	private static final int MAXN = 30001;
	private static final int[] stack = new int[MAXN];
	private static int r;

	public int sumSubarrayMins(int[] arr) {
		long ans = 0;
		r = 0;
		for (int i = 0; i < arr.length; i++) {
			while (r > 0 && arr[stack[r - 1]] >= arr[i]) {
				int cur = stack[--r];
				int left = r == 0 ? -1 : stack[r - 1];
				ans = (ans + (long) (cur - left) * (i - cur) * arr[cur]) % MOD;
			}
			stack[r++] = i;
		}
		while (r > 0) {
			int cur = stack[--r];
			int left = r == 0 ? -1 : stack[r - 1];
			ans = (ans + (long) (cur - left) * (arr.length - cur) * arr[cur]) % MOD;
		}
		return (int) ans;
	}

}
