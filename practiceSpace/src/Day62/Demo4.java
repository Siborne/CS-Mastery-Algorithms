package Day62;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int n = reader.nextInt();
		int m = reader.nextInt();
		int a = reader.nextInt();
		int b = reader.nextInt();
		int ans = n * a;
		if(n%m==0) {
			ans = Math.min(ans, (n/m)*b);
		}else {
			ans = Math.min(ans, Math.min((n/m+1)*b, (n/m)*b+(n%m)*a));
		}
		System.out.println(ans);
		
		
		reader.close();
	}
	
}
