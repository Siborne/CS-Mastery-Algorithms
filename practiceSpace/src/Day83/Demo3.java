package Day83;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int t = reader.nextInt();
		while(t-->0) {
			int n = reader.nextInt();
			int[] arr = new int[n];
			
			StringBuilder sb = new StringBuilder();
			for(int i = 0;i<n;i++) {
				arr[i] = reader.nextInt();
			}
			int[] brr = new int[n];
			int l = 0;
			int r = n-1;
			int i = 0;
			boolean flag = true;
			while(l<=r) {
				if(flag) {
					brr[i++] = arr[l++];
				}else {
					brr[i++] = arr[r--];
				}
				flag = !flag;
			}
			
			for(int b:brr) {
				System.out.print(b+" ");
			}
			System.out.println();
		}
		
		reader.close();
	}
	
}
