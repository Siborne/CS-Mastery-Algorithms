package Day142;

public class Demo4 {

	public double myPow(double x, int n) {
		long N = n;
		return N >= 0 ? quickMul(x, N) : 1.0 / quickMul(x, -N);
	}

	private static double quickMul(double x, long N) {
		double ans = 1.0;
		double x_contribute = x;
		while (N > 0) {
			if ((N & 1) == 1) {
				ans *= x_contribute;
			}
			x_contribute *= x_contribute;
			N <<= 1;
		}
		return ans;
	}

	private static double quickMul2(double x, long N) {
		if (N == 0) {
			return 1.0;
		}
		double y = quickMul2(x, N >> 1);
		return (N & 1) == 1 ? y * y * x : y * y;
	}

}
