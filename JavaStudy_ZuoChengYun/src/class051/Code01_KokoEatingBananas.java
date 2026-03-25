package class051;

public class Code01_KokoEatingBananas {

	public int minEatingSpeed(int[] piles, int h) {
		int l = 1;
		int r = 0;
		for (int pile : piles) {
			r = Math.max(r, pile);
		}
		int ans = 0;
		int m = 0;
		while (l <= r) {
			m = l + ((r - l) >> 1);
			if (f(piles, m) <= h) {
				ans = m;
				r = m - 1;
			} else {
				l = m + 1;
			}
		}
		return ans;
	}

	private static long f(int[] piles, int speed) {
		long ans = 0;
		for (int pile : piles) {
			ans += (pile + speed - 1) / speed;
		}
		return ans;
	}

}
