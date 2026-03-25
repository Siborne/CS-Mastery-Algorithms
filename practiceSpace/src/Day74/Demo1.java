package Day74;

import java.util.Arrays;
import java.util.Scanner;

public class Demo1 {

	private static final int MOD = 100003;

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int n = reader.nextInt();
		int k = reader.nextInt();
		int[] arr = new int[n+1];
		Arrays.fill(arr, -1);
		arr[0] = 1;
		
		System.out.println(dp(n,k,arr)%MOD);
		reader.close();
	}
	
	private static int dp(int n,int k,int[] arr) {
		if(arr[n]!=-1) {
			return arr[n];
		}
		int temp = 0;
		for(int i = 1;i<=k&&n-i>=0;i++) {
			temp+=(dp(n-i,k,arr)%MOD);
		}
		arr[n] = temp;
		return temp;
	}
	

}
