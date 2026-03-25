package Day85;

import java.util.Scanner;

public class Demo9 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int n = reader.nextInt();
			long ans = 0;
			int[] arr = new int[n];
			for(int i = 1;i<=n;i++) {
				arr[i] = reader.nextInt();
				if(i>1&&arr[i]>0) {
					ans+=arr[i];
				}
			}
			System.out.println(ans);
		}

		reader.close();
	}

}
