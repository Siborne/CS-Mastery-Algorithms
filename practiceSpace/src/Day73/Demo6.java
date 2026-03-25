package Day73;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int a = reader.nextInt();
		int b = reader.nextInt();
		int c = 0;
		int ans = 0;
		while(true) {
			ans+=a;
			c+=a;
			if(c<b) {
				break;
			}
			a=c/b;
			c%=b;
		}
		System.out.println(ans);
		reader.close();
	}
	
}
