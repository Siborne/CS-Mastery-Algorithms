package class052;

public class Code02_DailyTemperatures {

	private static final int MAXN = 100001;
	private static final int[] stack = new int[MAXN];
	private static int r;

	public int[] dailyTemperatures(int[] temperatures) {
		int n = temperatures.length;
		int[] ans = new int[n];
		r = 0;
		for (int i = 0, cur; i < n; i++) {
			while (r > 0 && temperatures[stack[r - 1]] < temperatures[i]) {
				cur = stack[--r];
				ans[cur] = i - cur;
			}
			stack[r++] = i;
		}
		return ans;
	}

}
