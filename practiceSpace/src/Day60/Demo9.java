package Day60;

import java.util.Scanner;

public class Demo9 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int t = reader.nextInt();
		while(t-->0) {
			int x =reader.nextInt();
			if(x>=1900) {
				System.out.println("Division 1");
			}else if (x>=1600) {
				System.out.println("Division 2");
			}else if(x>=1400) {
				System.out.println("Division 3");
			}else {
				System.out.println("Division 4");
			}
		}
		
		reader.close();
	}
	
}
