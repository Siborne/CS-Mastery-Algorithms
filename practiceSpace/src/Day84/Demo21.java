package Day84;

import java.util.Scanner;

public class Demo21 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int n = reader.nextInt();
		int ans = (int)Math.pow(n, 1.0/3.0);
		System.out.println(String.format("%3d", ans));
		
		reader.close();
	}
	
}
