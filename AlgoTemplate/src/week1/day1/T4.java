package week1.day1;

public class T4 {

	private static final int MOD = 7;

	public static void main(String[] args) {
		int addDay = quickMod(20, 22, MOD);
		System.out.println((addDay + 6) % 7 == 0 ? 7 : (addDay + 6) % 7);
	}

	private static int quickMod(int base, int exp, int mod) {
		int result = 1;
		while (exp > 0) {
			if ((exp & 1) == 1) {
				result = (result * base) % MOD;
			}
			base = (base * base) % MOD;
			exp >>= 1;
		}
		return result;
	}

}
