package Day65;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int t = reader.nextInt();
		while(t-->0) {
			int x = reader.nextInt();
			int ans = 0;
			while(x%6==0) {
				ans++;
				x/=6;
			}
			while(x%3==0) {
				ans+=2;
				x/=3;
			}
			if(x==1) {
				System.out.println(ans);
			}else{
				System.out.println(-1);
			}
		}
		
		reader.close();
	}
	
}
