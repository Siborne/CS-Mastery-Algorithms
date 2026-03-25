package Day84;

import java.util.Scanner;

public class Demo38 {
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int a = reader.nextInt();
		int b = reader.nextInt();
		int max = Math.max(a, b);
		System.out.println(max);
		
		reader.close();
	}
	
}
