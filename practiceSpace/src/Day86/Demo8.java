package Day86;

import java.util.Arrays;
import java.util.Scanner;

public class Demo8 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int k = reader.nextInt();
		int[] arr = new int[12];
		for (int i = 0; i < 12; i++) {
			arr[i] = reader.nextInt();
		}
		Arrays.sort(arr);
		int sum = 0;
		int ans = 0;
		int i = 11;
		while(sum<k&&i>=0) {
			sum+=arr[i--];
			ans++;
		}
		if(sum<k) {
			System.out.println("-1");
		}else {
			System.out.println(ans);
		}
		
		reader.close();
	}

}
