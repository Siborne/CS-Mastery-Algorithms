package Day44;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		long ans = 0;
		while(n!=0) {
			n-=getdigits(n);
			ans++;
		}
		System.out.println(ans);
		reader.close();
	}
	
	private static int getdigits(int n) {
		int res = 0;
		while(n>0) {
			res+=n%10;
			n/=10;
		}
		return res;
	}

}
