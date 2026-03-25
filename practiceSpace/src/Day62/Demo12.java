package Day62;

import java.util.Arrays;
import java.util.Scanner;

public class Demo12 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int n = reader.nextInt();
		int k = reader.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = reader.nextInt();
		}
		Arrays.sort(arr);
		int ans = 0;
		int i = 2;
		while(i<n) {
			if(5-arr[i]>=k) {
				ans++;
				i+=3;
			}else {
				break;
			}
		}
		System.out.println(ans);
		reader.close();
	}
	
}
