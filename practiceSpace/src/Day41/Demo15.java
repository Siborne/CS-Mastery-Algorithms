package Day41;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Demo15 {

	public static void main(String[] args) {
//		System.out.println(findPQ(1001733993063167141L, 212353L));
		List<Long> list =  findPQ(1001733993063167141L,212353L);
		BigInteger n = new BigInteger("1001733993063167141");
		BigInteger d = new BigInteger("212353");
		BigInteger c = new BigInteger("20190324");
		
		String str1 = String.valueOf(list.get(0));
		String str2 = String.valueOf(list.get(1));
		BigInteger p = new BigInteger(str1);
		BigInteger q = new BigInteger(str2);
		BigInteger e = d.modInverse(p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE)));
		BigInteger res = c.modPow(e, n);
		System.out.println(res);
//		BigInteger p = new BigInteger
	}

	private static List<Long> findPQ(long n, long d) {
		List<Long> list = new ArrayList<>();
		for (long i = 2L; i * i <= n; i++) {
			if (n % i == 0 && gcd(d, (n / i - 1) * (i - 1)) == 1 && isPrime(i) && isPrime(n / i)) {
				list.add(i);
				list.add(n / i);
			}
		}
		return list;
	}

	private static boolean isPrime(long n) {
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static long gcd(long a, long b) {
		if (b == 0) {
			return a;
		}
		long min = Math.min(a, b);
		long max = Math.max(a, b);
		return gcd(min, max % min);
	}

}
