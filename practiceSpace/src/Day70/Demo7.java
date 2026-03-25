package Day70;

import java.util.Arrays;
import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int n = reader.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = reader.nextInt();
		}
		Arrays.sort(arr);
		int m = reader.nextInt();
		int[] brr = new int[m];
		for(int i = 0;i<m;i++) {
			brr[i] = reader.nextInt();
		}
		Arrays.sort(brr);
		int ans = 0;
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<m;j++) {
				if(Math.abs(arr[i]-brr[j])<=1&&arr[i]!=-1&&brr[j]!=-1) {
					ans++;
					arr[i] = -1;
					brr[j] = -1;
				}
			}
		}
		System.out.println(ans);
		
		reader.close();
	}
	
}
