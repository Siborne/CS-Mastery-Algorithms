package Day50;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int a = reader.nextInt();
		int b = reader.nextInt();
		int ans = 0;
		while(a<b) {
			a*=3;
			b*=2;
			ans++;
		}
		System.out.println(ans+1);
		reader.close();
	}
	
}
