package Day21;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = reader.nextInt();
		}
		
		int ans = 0;
		
		for(int i = 1;i<n-1;i++) {
			if(arr[i]>=arr[i-1]+arr[i+1]) {
				ans++;
			}
		}
		
		System.out.println(ans);
		reader.close();
	}

}
