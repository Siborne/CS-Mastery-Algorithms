package Day61;

import java.util.Scanner;

public class Demo9 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int t = reader.nextInt();
		while(t-->0) {
			int n = reader.nextInt();
			int[] arr = new int[n+2];
			for(int i = 1;i<=n;i++) {
				arr[i] = reader.nextInt();
			}
			
			if(arr[1]!=arr[2]&&arr[1]!=arr[3]) {
				System.out.println(1);
				continue;
			}
			
			for(int i =2;i<=n;i++) {
				if(arr[i]!=arr[i-1]&&arr[i]!=arr[i+1]) {
					System.out.println(i);
					break;
				}
			}
			
		}
		
		reader.close();
	}
	
}
