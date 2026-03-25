package Day61;

import java.util.Arrays;
import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
	
		int t = reader.nextInt();
		while(t-->0) {
			int n = reader.nextInt();
			int[] arr = new int[n];
			for(int i = 0;i<n;i++) {
				arr[i]= reader.nextInt();
			}
			Arrays.sort(arr);
			int temp = 0;
			for(int i = 0;i<n-1;i++) {
				temp = arr[i+1]-arr[i];
				if(temp>1) {
					break;
				}
			}
			
			if(temp>1) {
				System.out.println("NO");
			}else {
				System.out.println("YES");
			}
		}
		
		reader.close();
	}
	
}
