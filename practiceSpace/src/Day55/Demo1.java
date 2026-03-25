package Day55;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int last = -1;
		int max = 0;
		int ans = 0;
		for (int i = 0; i < n; i++) {
			int x = reader.nextInt();
			if(last<=x) {
				max++;
				ans = Math.max(ans, max);
			}else {
				max = 1;
			}
			last = x;
		}

		System.out.println(ans);
		reader.close();
	}

}
