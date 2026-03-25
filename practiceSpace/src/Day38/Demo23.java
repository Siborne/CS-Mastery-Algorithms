package Day38;

import java.util.Scanner;

public class Demo23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int[] arr = new int[n + 1];
		for (int i = 1; i < arr.length; i++) {
			arr[i] = reader.nextInt();
		}
		int maxLen = 0;
		for (int i = 1; i < arr.length; i++) {
			int len = getLen(arr, i, 0);
			if (maxLen < len) {
				maxLen = len;
			}
		}
		System.out.println(maxLen);
		reader.close();
	}
	
	private static int getLen(int[] arr,int i,int len) {
		int key = arr[i];
		len++;
		
		while(key!=i) {
			if(len>arr.length) {
				return 0;
			}
			key = arr[key];
			len++;
		}
		
		return len;
	}

}
