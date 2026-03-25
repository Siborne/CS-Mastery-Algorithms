package LGR_233_Div4;

import java.math.BigInteger;
import java.util.Scanner;

public class T2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		BigInteger n = new BigInteger(reader.next());
		BigInteger a = new BigInteger(reader.next());
		BigInteger b = new BigInteger(reader.next());
		BigInteger na = n.multiply(a);
//		long n = reader.nextLong();
//		long a = reader.nextLong();
//		long b = reader.nextLong();
//		System.out.println(na > b ? b :na);

		if(na.max(b)==b) {
			System.out.println(na);
		}else {
			System.out.println(b);
		}
		
		reader.close();
	}

}
