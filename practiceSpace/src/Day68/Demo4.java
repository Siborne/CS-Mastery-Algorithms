package Day68;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int[] arr = new int[n+1];
		for (int i = 1; i <= n; i++) {
			arr[i] = reader.nextInt();
		}
		int[] brr = new int[n+2];
		for(int i = 1;i<n;i++) {
			brr[i] = brr[i-1]+arr[i];
		}
		int m = reader.nextInt();
		
		for (int i = 0; i < m; i++) {
			int question = reader.nextInt();
			int l = 1;
			int r = n;
			while(l<r) {
				int mid = (r-l)/2+l;
				if(brr[mid]>=question) {
					r = mid;
				}else {
					l = mid+1;
				}
			}
			System.out.println(l);
		}
		
		

		reader.close();
	}

}
