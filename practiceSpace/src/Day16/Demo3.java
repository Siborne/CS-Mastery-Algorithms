package Day16;

import java.util.Arrays;
import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int m =reader.nextInt();
		int[] arr = new int[n+1];
		for(int i = 0;i<n;i++) {
			arr[i] = reader.nextInt();
		}
		arr[n]= 0;
		Arrays.sort(arr);
		int ans = 0;
		int pos = 0;
		for(int i = 0;i<=n;i++) {
			if(arr[i]==0) {
				pos = i;
				break;
			}
		}
		
		for(int l = pos,r=n;l>=0;l--) {
			if(arr[pos]-arr[l]>m) {
				break;
			}
			while(r>pos&&2*(arr[pos]-arr[l])+(arr[r]-arr[pos])>m) {
				r--;
			}
			ans = Math.max(ans, r-l+1);
		}
		
		
		for(int l = 0,r=pos;r<=n;r++) {
			if(arr[r]-arr[pos]>m) {
				break;
			}
			while(l<pos&&2*(arr[r]-arr[pos])+(arr[pos]-arr[l])>m) {
				l++;
			}
			ans = Math.max(ans, r-l+1);
		}
		
		ans--;
		System.out.println(ans);
		
	}

}
