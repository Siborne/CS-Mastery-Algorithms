package Day97;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int min =Integer.MAX_VALUE;
		int n = reader.nextInt();
		while(n-->0) {
			int x = reader.nextInt();
			min = Math.min(x, min);
		}
		System.out.println(min);
		reader.close();
	}
	
}
