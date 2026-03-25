package Day79;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int m = reader.nextInt();

		int ccf = 0;
		if ((n & 1) == 1) {
			ccf = 1;
		}
		int min = n / 2 + ccf;
		int max = n;
		
		for(int i = min;i<=max;i++) {
			if(i%m==0) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(-1);
		reader.close();
	}

}
