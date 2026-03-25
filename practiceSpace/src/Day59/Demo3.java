package Day59;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int max,min = reader.nextInt();
		max = min;
		int ans =0 ;
		for(int i = 1;i<n;i++) {
			int x =reader.nextInt();
			if(x>max) {
				max = x;
				ans++;
			}
			if(x<min) {
				min = x;
				ans++;
			}
		}
		System.out.println(ans);
		reader.close();
	}
	
}
