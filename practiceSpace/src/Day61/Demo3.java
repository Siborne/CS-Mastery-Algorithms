package Day61;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int t = reader.nextInt();
		while(t-->0) {
			int a = reader.nextInt();
			int b = reader.nextInt();
			int c = reader.nextInt();
			if(a+b==c) {
				System.out.println("+");
			}else {
				System.out.println("-");
			}
		}
		
		reader.close();
	}
	
}
