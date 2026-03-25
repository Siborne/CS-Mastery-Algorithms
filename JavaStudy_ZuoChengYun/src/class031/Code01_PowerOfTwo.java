package class031;

public class Code01_PowerOfTwo {
	public boolean isPowerOfTwo(int n) {
		return n > 0 && n == lowbit(n);
	}

	private static int lowbit(int n) {
		return n & (-n);
	}
}
