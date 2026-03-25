package Day147;

import java.math.BigInteger;

public class Demo2 {

	public static void main(String[] args) {
		BigInteger ans = BigInteger.ZERO;
		int count = 859000;
//		int count = 5;
		for (int i = 1; i <= count; i+=2) {
			BigInteger temp = new BigInteger(String.valueOf(i));
			ans = ans.add(temp.multiply(temp));
		}
		System.out.println(ans);
	}
	
}
