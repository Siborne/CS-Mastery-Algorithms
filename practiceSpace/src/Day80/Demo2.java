package Day80;

import java.util.Arrays;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int[] arr = new int[3];
			for(int i = 0;i<3;i++) {
				arr[i] = reader.nextInt();
			}
			for(int i = 0;i<5;i++) {
				Arrays.sort(arr);
				arr[0]++;
			}
			int ans = 1;
			for(int a:arr) {
				ans*=a;
			}
			System.out.println(ans);
		}

		reader.close();
	}

}
