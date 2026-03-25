package Day62;

import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int t = reader.nextInt();
		while(t-->0) {
			int x = 0;
			for(int i = 0;i<3;i++) {
				x^=reader.nextInt();
			}
			System.out.println(x);
		}
		
		reader.close();
	}
	
}
