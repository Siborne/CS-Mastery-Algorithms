package Day62;

import java.util.Scanner;

public class Demo15 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int t = reader.nextInt();
		while(t-->0) {
			int x = reader.nextInt();
			if(x%3==0) {
				System.out.println("Second");
			}else {
				System.out.println("First");
			}
		}
		
		reader.close();
	}
	
}
