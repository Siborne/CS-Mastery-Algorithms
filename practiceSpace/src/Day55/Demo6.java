package Day55;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int t = reader.nextInt();
		while(t-->0) {
			long n = reader.nextLong();
			if(n<=2) {
				System.out.println(0);
				continue;
			}
			if(n%2==0) {
				System.out.println(n/2-1);
			}else {
				System.out.println(n/2);
			}
		}
		
		
		reader.close();
	}
	
}
