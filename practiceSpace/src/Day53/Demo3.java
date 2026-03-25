package Day53;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int t = reader.nextInt();
		while(t-->0) {
			int a = reader.nextInt();
			int b = reader.nextInt();
			int ans = a%b;
			System.out.println(ans==0?0:b-ans);
		}
		
		reader.close();
	}
	
}
