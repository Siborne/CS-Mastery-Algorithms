package Day62;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int x = reader.nextInt();
		int ans = 0;
		while(x>0) {
			ans += x%2;
			x/=2;
		}
		System.out.println(ans);
		reader.close();
	}
	
	
}
