package Day61;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int t = reader.nextInt();
		while(t-->0) {
			int a = reader.nextInt();
			int b = reader.nextInt();
			int c = Math.abs(a-b);
			int ans = c%10==0?c/10:c/10+1;
			System.out.println(ans);
		}
		
		reader.close();
	}
	
}
