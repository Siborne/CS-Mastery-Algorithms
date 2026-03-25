package Day52;

import java.util.Scanner;

public class Demo1 {
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		long n = reader.nextLong();
		if((n&1)==0) {
			System.out.println(n/2);
		}else {
			System.out.println(-n/2-1);
		}
		reader.close();
	}

}
