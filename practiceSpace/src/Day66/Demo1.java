package Day66;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int t = reader.nextInt();
		while(t-->0) {
			int x = reader.nextInt();
			int y = reader.nextInt();
			int n = reader.nextInt();
			System.out.println((n-y)/x*x+y);
		}
		
		reader.close();
	}
	
}
