package Day37;

import java.math.BigInteger;

public class Demo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger bigInteger = new BigInteger("20");
		bigInteger = bigInteger.pow(22).mod(new BigInteger("7"));
		System.out.println(bigInteger);
		System.out.println(7);
	}

}
