package Day81;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int n = reader.nextInt();
		int[] arr = new int[3];
		for(int i = 0;i<n;i++) {
			int x = reader.nextInt();
			arr[x%3]++;
		}
		
		int ans = Math.min(arr[1], arr[2])+arr[0]/2;
		System.out.println(ans);
		
		reader.close();
	}
	
}
