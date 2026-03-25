package Day83;

import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int n = reader.nextInt();
			int m = reader.nextInt();
			reader.nextLine();
			int[] arr = new int[7];
			char[] chs = reader.nextLine().toCharArray();
			for(int i = 0;i<n;i++) {
				arr[chs[i]-'A']++;
			}
			int ans = 0;
			for(int a:arr) {
				if(a<m) {
					ans+=m-a;
				}
			}
			System.out.println(ans);
		}

		reader.close();
	}

}
