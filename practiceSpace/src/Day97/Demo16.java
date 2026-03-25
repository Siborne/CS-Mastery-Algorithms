package Day97;

import java.util.Scanner;

public class Demo16 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		long ans = 0;
		for(int i = 1;i<=n;i++) {
			if(fun(i)) {
				ans+=i;
			}
		}
		System.out.println(ans);
		reader.close();
	}
	
	private static boolean fun(int n) {
		if(n%7==0) {
			return false;
		}
		while(n>0) {
			if(n%10==7) {
				return false;
			}
			n/=10;
		}
		return true;
	}
	
}
