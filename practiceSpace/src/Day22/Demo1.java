package Day22;

import java.util.Arrays;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int w = reader.nextInt();
		int n = reader.nextInt();
		int[] p = new int[n];
		for(int i = 0;i<n;i++) {
			p[i] = reader.nextInt();
		}
		Arrays.sort(p);
		int l = 0;
		int r = p.length-1;
		int ans = 0;
		while(l<=r) {
			int sum;
			if(l!=r) {
				sum = p[l] + p[r];
				
				if(sum<=w) {
					ans++;
					l++;
					r--;
				}else {
					ans++;
					r--;
				}
				
			}else {
				ans++;
				break;
			}
			
		}
		System.out.println(ans);
	}

}
