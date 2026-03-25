package class051;

public class Code05_MaximumRunningTimeOfNComputers {

	public long maxRunTime1(int n, int[] batteries) {
		long sum = 0;
		for (int x : batteries) {
			sum += x;
		}
		long ans = 0;
		for (long l = 0, r = sum, m; l <= r;) {
			m = l + ((r - l) >> 1);
			if (f1(batteries, n, m)) {
				ans = m;
				l = m + 1;
			} else {
				r = m - 1;
			}
		}
		return ans;
	}

	private static boolean f1(int[] arr, int num, long time) {
		long sum = 0;
		for (int x : arr) {
			if (x > time) {
				num--;
			} else {
				sum += x;
			}
			if (sum >= (long) num * time) {
				return true;
			}
		}
		return false;
	}

	public long maxRunTime2(int n, int[] batteries) {
		int max = 0;
		long sum = 0;
		for (int x : batteries) {
			max = Math.max(max, x);
			sum += x;
		}
		if (sum > (long) max * n) {
			return sum / n;
		}
		int ans = 0;
		for (int l = 0, r = max, m; l <= r;) {
			m = l + ((r - l) >> 1);
			if (f2(batteries, n, m)) {
				ans = m;
				l = m + 1;
			} else {
				r = m - 1;
			}
		}
		return ans;
	}

	private static boolean f2(int[] arr, int num, int time) {
		long sum = 0;
		for (int x : arr) {
			if (x > time) {
				num--;
			} else {
				sum += x;
			}
			if (sum >= (long) num * time) {
				return true;
			}
		}
		return false;
	}

}
