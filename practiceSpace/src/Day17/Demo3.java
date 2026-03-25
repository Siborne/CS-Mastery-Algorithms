package Day17;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int maxn = 0;
		int maxi = 0;
		int[] arr = new int[n+1];
		
		for(int i = 1;i<=n;i++) {
			arr[i] = reader.nextInt();
			maxn = Math.max(maxn, arr[i]);
		}
		
		for(int i = 0;i<=n;i++) {
			int[] f = new int[n+1];
			int x = 1;
			int sum = 0;
			int j = i;
			int m = n;
			
			while(true) {
				if(f[j]==0) {
					if(x==arr[j]) {
						sum+=arr[j];
						f[j]=1;
						x = 0;
						maxi = Math.max(maxi, sum);
						m--;
					}
					x++;
				}
				if(x>maxn||m<=0) {
					break;
				}
				j++;
				if(j==n+1) {
					j=1;
				}
			}
			
		}
		System.out.println(maxi);
		return;
	}

}
