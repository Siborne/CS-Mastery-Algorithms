package Day84;

import java.util.Scanner;

public class Demo26 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int n = reader.nextInt();
		int s = 4*n-2*(n+1)-1;
		System.out.println(s);
		
		reader.close();
	}
	
}
