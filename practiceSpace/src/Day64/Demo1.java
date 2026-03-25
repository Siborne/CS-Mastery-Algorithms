package Day64;

import java.util.Arrays;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int t = reader.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = reader.nextInt();
		}
		int ans = 0;
		int i = 0;
		int j = 0;
		int temp = 0;
		while(i<n) {
			temp += arr[i];
			if(t>=temp) {
				ans =Math.max(ans, i-j+1) ;
			}
			while(temp>t){
				temp-=arr[j];
				j++;
			}
			i++;
		}
		System.out.println(ans);
	}
	
}
