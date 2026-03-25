package Day66;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int n = reader.nextInt();
			
			System.out.println(n/2);
		}

		reader.close();
	}
	
	private static int gcd(int a,int b) {
		if(b==0) {
			return a;
		}
		return gcd(b,a%b);
	}

}
