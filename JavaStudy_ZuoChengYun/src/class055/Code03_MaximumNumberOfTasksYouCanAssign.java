package class055;

import java.util.Arrays;

public class Code03_MaximumNumberOfTasksYouCanAssign {

	private static final int MAXN = (int) 5e5 + 1;

	private static int[] deque = new int[MAXN];

	private static int head, tail;

	private static int[] tasks;
	private static int[] workers;

	public int maxTaskAssign(int[] ts, int[] ws, int pills, int strength) {
		Arrays.sort(ts);
		Arrays.sort(ws);
		tasks = ts;
		workers = ws;
		int tSize = tasks.length;
		int wSize = workers.length;
		int ans = 0;
		for (int l = 0, r = Math.min(tSize, wSize), m; l <= r;) {
			m = (l + r) / 2;
			if (f(0, m - 1, wSize - m, wSize - 1, strength, pills)) {
				ans = m;
				l = m + 1;
			} else {
				r = m - 1;
			}
		}
		return ans;
	}

	private static boolean f(int tl, int tr, int wl, int wr, int s, int pills) {
		head = tail = 0;
		int cnt = 0;
		for (int i = wl, j = tl; i <= wr; i++) {
			for (; j <= tr && tasks[j] <= workers[i]; j++) {
				deque[tail++] = j;
			}
			if (head < tail && tasks[deque[head]] <= workers[i]) {
				head++;
			} else {
				for (; j <= tr && tasks[j] <= workers[i] + s; j++) {
					deque[tail++] = j;
				}
				if (head < tail) {
					cnt++;
					tail--;
				} else {
					return false;
				}
			}
		}

		return cnt <= pills;
	}

}
