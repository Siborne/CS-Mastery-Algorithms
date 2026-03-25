package Day147;

import java.math.BigInteger;

public class Demo4 {

	private static final BigInteger TWO = BigInteger.valueOf(2);

	public static void main(String[] args) {
		BigInteger first = BigInteger.ONE;
		BigInteger second = BigInteger.valueOf(2);
		BigInteger ans = BigInteger.ZERO.add(second);
		BigInteger maxValue = BigInteger.valueOf(4_000_000);

		while (true) {
			BigInteger third = first.add(second);
			if (third.compareTo(maxValue) > 0) {
				break;
			}
			if (third.mod(TWO).equals(BigInteger.ZERO)) {
				ans = ans.add(third);
			}
			first = second;
			second = third;
		}

		System.out.println(ans);
	}

}
