package week1.day1;

import java.math.BigInteger;

public class T3 {

	public static void main(String[] args) {
		long mod = (long) 1e9;
		long fact = 1;
		long sum = 0;
		for (int i = 1; i <= 40; i++) {
			fact = (fact * i) % mod;
			sum = (sum + fact) % mod;
		}
		System.out.printf("%09d\n", sum);
	}

	public static void main2(String[] args) {
		BigInteger a = new BigInteger("1");
		BigInteger res = BigInteger.ZERO;
		for (long i = 1; i <= 202320232023L; i++) {
			a.multiply(new BigInteger(String.valueOf(i)));
			res.add(a);
		}
		System.out.println(String.valueOf(res).substring(String.valueOf(res).length() - 9));
	}

}
