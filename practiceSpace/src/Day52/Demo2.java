package Day52;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int ans = 0;
		int last = -1;
		for(int i = 0;i<n;i++) {
			int x = reader.nextInt();
			if(x!=last) {
				last=x;
				ans++;
			}
		}
		System.out.println(ans);
		reader.close();
	}

}
