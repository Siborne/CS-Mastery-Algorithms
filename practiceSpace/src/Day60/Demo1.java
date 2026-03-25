package Day60;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int n = reader.nextInt();
		reader.nextLine();
		while(n-->0) {
			String s = reader.nextLine().toLowerCase();
			if(s.equals("yes")) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
		
		reader.close();
	}
	
}
