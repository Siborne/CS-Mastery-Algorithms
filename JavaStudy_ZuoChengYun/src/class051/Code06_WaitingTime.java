package class051;

public class Code06_WaitingTime {

	public long minimumTime(int[] time, int totalTrips) {
		int min = Integer.MAX_VALUE;
		for (int x : time) {
			min = Math.min(min, x);
		}
		long ans = 0;

		for (long l = 0, r = (long) min * totalTrips, m; l <= r;) {
			m = l + ((r - l) >> 1);
			if (f(time, m) >= totalTrips) {
				ans = m;
				r = m - 1;
			} else {
				l = m + 1;
			}
		}

		return ans;
	}

	private static long f(int[] arr, long time) {
		long ans = 0;
		for (int num : arr) {
			ans += (time / num);
		}
		return ans;
	}

}
