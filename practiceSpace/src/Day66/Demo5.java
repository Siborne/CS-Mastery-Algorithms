package Day66;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int t = reader.nextInt();
		int[] arr = new int[n];
		for(int i = 1;i<n;i++) {
			arr[i] = reader.nextInt();
		}
		
		int index = 1;
		while(index<=t&&index<=n) {
			if(index==t) {
				System.out.println("YES");
				return;
			}
			if(index>=n) {
				break;
			}
			index += arr[index];
		}
		System.out.println("NO");
		reader.close();
	}

}
