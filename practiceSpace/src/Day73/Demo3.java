package Day73;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while(t-->0) {
			int n = reader.nextInt();
			int ans = n/4;
			System.out.println(n%4==0?ans:(ans+1));
		}
		
		
		reader.close();
	}

}
