package Day11;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int a = reader.nextInt();
		int b = reader.nextInt();
		System.out.println(ksm(a,b));
	}

	public static long ksm(int a,int b) {
		long res = 1;
		while(b>0) {
			if((b&1)>0) {
				res*=a;
			}
			a = a*a;
			b>>=1;
		}
		return res;
	}
	
}
