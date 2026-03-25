package Day79;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int n = reader.nextInt();
		if(n==0) {
			System.out.println("1");
			return;
		}
		int[] arr = {6,8,4,2};
		System.out.println(arr[n%4]);
		
		reader.close();
	}
	
}
