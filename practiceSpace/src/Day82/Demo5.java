package Day82;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int n = reader.nextInt();
		int[] arr = new int[n+2];
		int c = 0;
		for(int i = 1;i<=n;i++) {
			arr[i] = reader.nextInt();
			c+=arr[i];
		}
		int maxn = 0;
		for(int i = 1;i<=n;i++) {
			for(int j = i;j<=n;j++) {
				int s = c;
				for(int k = i;k<=j;k++) {
					if(arr[k]==1) {
						s--;
					}else {
						s++;
					}
				}
				if(s>maxn) {
					maxn = s;
				}
			}
		}
		System.out.println(maxn);
		reader.close();
	}
	
}
