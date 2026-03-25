package class055;

public class Code02_MaxValueOfEquation {

	private static final int MAXN = (int) 1e5 + 1;
	private static int[][] deque = new int[MAXN][2];
	private static int head, tail;

	public int findMaxValueOfEquation(int[][] points, int k) {
		head = tail = 0;
		int n = points.length;
		int ans = Integer.MIN_VALUE;
		for (int i = 0, x, y; i < n; i++) {
			x = points[i][0];
			y = points[i][1];
			while (head < tail && deque[head][0] + k < x) {
				head++;
			}
			
			if (head < tail) {
				ans = Math.max(ans, x + y + deque[head][1] - deque[head][0]);
			}

			while (head < tail && deque[tail - 1][1] - deque[tail - 1][0] <= y - x) {
				tail--;
			}
			deque[tail][0] = x;
			deque[tail++][1] = y;
		}
		return ans;
	}

}
