package Day84;

import java.util.Scanner;

public class Demo20 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int n = reader.nextInt();
		long ans = 0;
		for (int x = 1; x <= n; x++) {
			int y = n / x;
			int temp = x - y;
			ans += temp;
		}
		System.out.println(ans);
		
		reader.close();
	}
	
}
