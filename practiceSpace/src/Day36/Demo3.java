package Day36;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		solve();
		reader.close();
	}
	
	private static void solve() {
		int n = 2;
		int count = 0;
		while(count < 2019) {
			if(isPrime(n)) {
				count++;
			}
			n++;
		}
		System.out.println(n-1);
	}
	
	private static boolean isPrime(int n) {
		for(int i = 2;i*i<=n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	

}
