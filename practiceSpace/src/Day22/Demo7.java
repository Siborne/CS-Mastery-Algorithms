package Day22;

import java.util.Scanner;

public class Demo7 {
	private static final int MAXN = 2000;
	private static int[] num = {6,2,5,5,4,5,6,3,7,6};
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		reader.close();
		
		int[] a = new int[MAXN+5];
		int ans = 0;
		a[0] = 6;
		for(int i = 1;i<=MAXN;i++) {
			int temp = i;
			while(temp>0) {
				a[i]+=num[temp%10];
				temp/=10;
			}
		}
		
		for(int i = 0;i<=1000;i++) {
			for(int j = 0;j<=1000;j++) {
				if(a[i]+a[j]+a[i+j]+4==n) {
					ans++;
				}
			}
		}
		
		System.out.println(ans);
	}

}
