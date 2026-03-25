package Day84;

import java.util.Scanner;

public class Demo37 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int a = reader.nextInt();
		int b = reader.nextInt();
		int min = Math.min(a, b);
		System.out.println(min);
		
		reader.close();
	}
	
}
