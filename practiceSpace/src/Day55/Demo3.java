package Day55;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int n = reader.nextInt();
		int[] arr = new int[n+1];
		arr[1] = reader.nextInt();
		arr[2] = reader.nextInt();
		arr[3] = reader.nextInt();
		int oe = (arr[1]%2+arr[2]%2+arr[3]%2)/2;
		
		for(int i = 1;i<=n;i++) {
			if(i>3) {
				arr[i] = reader.nextInt();
			}
			
			if(arr[i]%2!=oe) {
				System.out.println(i);
				return;
			}
			
		}
		
		reader.close();
	}
	
}
