package Day84;

import java.util.Scanner;

public class Demo14 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int n = reader.nextInt();
		int ans = (int) Math.floor(Math.sqrt(n));
		System.out.println(ans);
		
		reader.close();
	}
	
}
