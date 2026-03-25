package Day99;

import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		boolean flag = true;
		int cnt = 0;
		long sum = 0;
		for (int i = 0; i < n; i++) {
			int x = reader.nextInt();
			if (flag) {
				sum += x;
			} else {
				sum -= x;
			}
			cnt++;
			cnt %= 2;
			if (cnt == 0) {
				flag = !flag;
			}
		}
		System.out.println(sum);
		reader.close();
	}

}
