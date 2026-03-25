package Day60;

import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int t = reader.nextInt();
		while(t-->0) {
			int ans = 0;
			int a = reader.nextInt();
			for(int i = 0;i<3;i++) {
				int x = reader.nextInt();
				if(a<x) {
					ans++;
				}
			}
			System.out.println(ans);
		}
		
		
		reader.close();
	}
	
}
