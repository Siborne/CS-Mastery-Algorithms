package Day75;

import java.util.Arrays;
import java.util.Scanner;

public class Demo43 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int n = reader.nextInt();
		int[] arr = new int[n];
		int[] brr = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = reader.nextInt();
			brr[i] = arr[i];
		}
		Arrays.sort(brr);
		int l = 0;
		int r = n-1;
		while(l<n&&arr[l]==brr[l]) {
			l++;
		}
		while(r>=0&&arr[r]==brr[r]) {
			r--;
		}
		
		if(l>=r) {
			System.out.println("yes");
			System.out.println("1 1");
			return;
		}
		
		int[] temp = new int[n];
		System.arraycopy(arr, 0, temp, 0, n);
		for(int i = l,j=r;i<=r;i++,j--) {
			temp[i] = arr[j];
		}
		
		boolean isSorted = true;
		for(int i = 0;i<n-1;i++) {
			if(temp[i]>temp[i+1]) {
				isSorted=false;
				break;
			}
		}
		
		if(isSorted) {
			System.out.println("yes");
			System.out.println((l+1)+" "+(r+1));
		}else {
			System.out.println("no");
		}
		
		
		reader.close();
	}
	
}
