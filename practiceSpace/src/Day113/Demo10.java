package Day113;

import java.math.BigInteger;
import java.util.Scanner;

public class Demo10 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		BigInteger a = new BigInteger("2");
		a = a.pow(n).subtract(BigInteger.ONE);
		System.out.println(a);
		reader.close();
	}

}
