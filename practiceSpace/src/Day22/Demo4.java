package Day22;

import java.util.Scanner;

public class Demo4 {
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int n =reader.nextInt();
		int[] a = new int[n+1];
		int[] f = new int[n+1];
		
		for(int i = 1;i<=n;i++) {
			a[i] = reader.nextInt();
		}
		reader.close();
		
		f[1] = a[1];
		
		for(int i = 2;i<=n;i++) {
			if(a[i]<=a[i-1]) {
				f[i] = f[i-1];
			}else {
				f[i] = f[i-1] + (a[i]-a[i-1]);
			}
		}
		
		
		System.out.println(f[n]);
	}
}
