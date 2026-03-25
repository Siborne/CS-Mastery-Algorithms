package Day52;

import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int[] arr = new int[n+1];
		for(int i = 1;i<=n;i++) {
			arr[reader.nextInt()] = i;
		}
		for(int i = 1;i<=n;i++) {
			System.out.print(arr[i]+" ");
		}
		reader.close();
	}

}
