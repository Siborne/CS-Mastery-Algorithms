package Day73;

import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
		Scanner reader = new  Scanner(System.in);
		
		int n = reader.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i]=reader.nextInt();
		}
		int maxLength = 1;
		int currentLength = 1;
		for(int i = 1;i<n;i++) {
			if(arr[i]>arr[i-1]) {
				currentLength++;
			}else {
				maxLength = Math.max(maxLength, currentLength);
				currentLength=1;
			}
		}
		maxLength = Math.max(maxLength, currentLength);
		System.out.println(maxLength);
		reader.close();
	}
	
}
