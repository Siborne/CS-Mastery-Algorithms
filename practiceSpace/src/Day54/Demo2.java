package Day54;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int ans = 0;
		ans+=n/100;
		n%=100;
		ans+=n/20;
		n%=20;
		ans+=n/10;
		n%=10;
		ans+=n/5;
		n%=5;
		ans+=n/1;
		System.out.println(ans);
	}
	
}
