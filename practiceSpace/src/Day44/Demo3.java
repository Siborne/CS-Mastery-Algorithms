package Day44;

import java.util.Scanner;

public class Demo3 {

	private static final int MOD = 998244353;
	private static final int MAXN = 100000;

	private static long[] fact = new long[MAXN + 1];
	private static long[] inv = new long[MAXN + 1];

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int m = reader.nextInt();
		int k = n / 4;

		factInit(MOD);
		
		long ans = 0;
		for(int i = m;i<=k;i++) {
			long comb1 = C(m,i,MOD);
			long comb2 = C(i,n-3*i,MOD);
			long pow = quickPow(10, n-4*i, MOD);
			long term = comb1 *comb2%MOD*pow%MOD;
			if((i-m)%2==0) {
				ans = (ans+term)%MOD;
			}else{
				ans = (ans-term+MOD)%MOD;
			}
		}
		
		System.out.println(ans);
		reader.close();
	}

	private static long quickPow(long a, int n, int mod) {
		long ans = 1;
		while (n > 0) {
			if ((n & 1) == 1) {
				ans = ans * a % mod;
			}
			a = a * a % mod;
			n >>= 1;
		}
		return ans;
	}

	private static long C(int m, int n, int mod) {
		if (m > n || m < 0 || n < 0) {
			return 0;
		}
		return fact[n] * inv[m] % mod * inv[n - m] % mod;
	}

	private static void factInit(int mod) {
		fact[0] = inv[0] = 1;
		for (int i = 1; i <= MAXN; i++) {
			fact[i] = fact[i - 1] * i % mod;
			inv[i] = inv[i - 1] * quickPow(i, mod - 2, mod) % mod;
		}
	}

}
