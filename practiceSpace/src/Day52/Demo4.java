package Day52;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader =  new Scanner(System.in);
		
		long n = reader.nextLong();
		long k = reader.nextLong();
		long odd = (long)Math.ceil(n/2.0);
		if(k>odd) {
			System.out.println((k-odd)*2);
		}else {
			System.out.println(k*2-1);
		}
		reader.close();
	}
	
}
