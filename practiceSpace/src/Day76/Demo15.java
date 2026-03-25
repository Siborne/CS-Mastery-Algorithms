package Day76;

import java.util.Scanner;

public class Demo15 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int n = reader.nextInt();
		int t = reader.nextInt();
		if(t==10) {
			if(n==1) {
				System.out.println(-1);
				return;
			}
			System.out.print(1);
			for(int i = 1;i<n;i++) {
				System.out.print(0);
			}
		}else {
			for(int i = 0;i<n;i++) {
				System.out.print(t);
			}
		}
		
		reader.close();
	}
	
}
