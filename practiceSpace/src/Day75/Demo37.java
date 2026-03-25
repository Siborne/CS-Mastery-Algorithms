package Day75;

import java.util.Scanner;

public class Demo37 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int t = reader.nextInt();
		while(t-->0) {
			int a = reader.nextInt();
			int b = reader.nextInt();
			int c = reader.nextInt();
			if(c%2==1) {
				if(a>=b) {
					System.out.println("First");
				}else {
					System.out.println("Second");
				}
			}else {
				if(b>=a) {
					System.out.println("Second");
				}else {
					System.out.println("First");
				}
			}
		}
		
		reader.close();
	}
	
}
