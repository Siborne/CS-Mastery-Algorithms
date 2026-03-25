package Day68;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int t = reader.nextInt();
		
		while(t-->0) {
			int n = reader.nextInt();
			int min = Integer.MAX_VALUE;
			int[] arr = new int[n];
			for(int i = 0;i<n;i++) {
				arr[i] = reader.nextInt();
				min = Math.min(min, arr[i]);
			}
			long ans = 1;
			boolean flag = false;
			for(int a:arr) {
				if(!flag&&min==a) {
					flag = true;
					ans *=(a+1);
				}else {
					ans*=a;
				}
			}
			System.out.println(ans);
		}
		
		reader.close();
	}
	
}
