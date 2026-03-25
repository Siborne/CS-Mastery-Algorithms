package chuanzhi;

import java.util.Scanner;

public class T1 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int t = reader.nextInt();
		while(t-->0) {
			int n = reader.nextInt();
			int ans = 0;
			int ji = Integer.MAX_VALUE;
			int ou = Integer.MAX_VALUE;
			for(int i = 1;i<=n;i++) {
				int k = reader.nextInt();
				if(i%2==0) {
					ou = Math.min(ou, k);
				}else {
					ji = Math.min(ji, k);
				}
			}
			ans = ji+ou;
			if(ans%2==0) {
				System.out.println("GEGE");
			}else {
				System.out.println("BEN");
			}
			
		}
	}
}
