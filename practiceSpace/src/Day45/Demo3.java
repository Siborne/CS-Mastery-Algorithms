package Day45;

import java.util.Scanner;

public class Demo3 {
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int m = reader.nextInt();
		int[] arr =new int[(n+2)*2];
		for(int i = 0;i<n;i++) {
			int l = reader.nextInt();
			int r = reader.nextInt();
			arr[l+r]++;
		}
		for(int i = 1;i<arr.length;i++) {
			arr[i] = arr[i] + arr[i-1];
		}
		for(int i = 0;i<m;i++) {
			int l = reader.nextInt();
			int r = reader.nextInt();
			int x = arr[r*2]-arr[l*2-1];
			System.out.println(x);
		}
		
		reader.close();
	}
	
}
