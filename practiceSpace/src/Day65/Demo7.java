package Day65;

import java.util.Arrays;
import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int m = reader.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = reader.nextInt();
		}

		Arrays.sort(arr);
		int ans = 0;
		int i = 0;
		while(m>0) {
			if(arr[i]>0) {
				break;
			}
			ans-=arr[i++];
			m--;
		}
		System.out.println(ans);
		
		reader.close();
	}

}
