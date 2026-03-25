package Round_101;

import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		long n  = reader.nextLong();
		long ans = 0;
		long temp = 1;
		while(true) {
			if(temp>n) {
				break;
			}
			ans+=temp;
			temp<<=1;
		}
		
		System.out.println(ans);
		reader.close();
	}
	
}
