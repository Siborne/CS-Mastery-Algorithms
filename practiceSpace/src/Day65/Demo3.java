package Day65;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int t = reader.nextInt();
		while(t-->0) {
			int n = reader.nextInt();
			int[] arr = new int[n];
			int jiSum = 0;
			int ouSum = 0;
			for(int i = 0;i<n;i++) {
				int x =reader.nextInt();
				if(x % 2 == 0) {
					ouSum++;
				}else {
					jiSum++;
				}
			}
			if(n%2==0) {
				if(jiSum%2==0) {
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
			}else {
				if(jiSum%2==0) {
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
			}
			
			
			
		}
		
		reader.close();
	}
	
}
