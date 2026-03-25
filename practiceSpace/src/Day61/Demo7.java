package Day61;

import java.util.Scanner;

public class Demo7 {
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int t = reader.nextInt();
		while(t-->0) {
			long n = reader.nextLong();
			if((n&(n-1))==0) {
				System.out.println("NO");
			}else {
				System.out.println("YES");
			}
		}
		
		reader.close();
	}

}
