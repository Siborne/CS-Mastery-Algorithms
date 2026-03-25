package Day95;

import java.math.BigInteger;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		BigInteger a =  new BigInteger(reader.nextLine());
		BigInteger b = new BigInteger(reader.nextLine());
		System.out.println(a.subtract(b));
		
		reader.close();
	}
	
}
