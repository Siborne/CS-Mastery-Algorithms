package Day74;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		long a1 = reader.nextLong();
		long a2 = reader.nextLong();
		long n = reader.nextLong();
		long d = a2 -a1;
		
		System.out.println(a1*n+n*(n-1)*d/2);
		
		reader.close();
	}
	
}
