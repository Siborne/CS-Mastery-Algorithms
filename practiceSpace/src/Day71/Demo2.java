package Day71;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int t = reader.nextInt();
		while(t-->0) {
			int n = reader.nextInt();
			if(n==3) {
				System.out.println(3);
			}else {
				System.out.println(2);
			}
		}
		
		reader.close();
	}
	
}
