package Day52;

import java.util.Arrays;
import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int[] arr = new int[n];
		int sum = 0;
		int total = 0;
		for(int i = 0;i<n;i++) {
			arr[i] = reader.nextInt();
			sum += arr[i];
		}
		
		Arrays.sort(arr);
		for(int i = n-1;n>=0;i--) {
			total+=arr[i];
			if(total>sum-total) {
				System.out.println(n-i);
				return;
			}
		}
		
		
		reader.close();
	}
	
}
