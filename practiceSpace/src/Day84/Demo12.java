package Day84;

import java.util.Scanner;

public class Demo12 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int n = reader.nextInt();
		int m = reader.nextInt();
		int ans = (n+m)%12;
		System.out.println(String.format("%3d", ans));
		
		reader.close();
	}
	
}
