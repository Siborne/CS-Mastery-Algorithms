package Day90;

import java.util.Scanner;

public class Demo1_2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		long m = reader.nextLong();
//		if(m==1) {
//			System.out.println(1);
//			return;
//		}

		long a = 1 % m;
		long b = 1 % m;
		long n = 1;
		while (a != 0 || b != 1) {
			long next = (a+b)%m;
			a=b;
			b = next;
			n++;
		}
		System.out.println(n);
		reader.close();
	}

}
