package Day75;

import java.util.Scanner;

public class Demo24 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int x = reader.nextInt();
		int y = reader.nextInt();
		long ans = (long)Math.pow(x+y, 3);
		System.out.println(ans);
		
		reader.close();
	}
	
}
