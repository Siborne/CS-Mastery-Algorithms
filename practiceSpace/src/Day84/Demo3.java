package Day84;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		System.out.println(n * (n - 1) / 2);
		
		reader.close();
	}
	
}
