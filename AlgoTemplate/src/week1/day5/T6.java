package week1.day5;

import java.util.Scanner;

public class T6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int x = reader.nextInt();
		int y = reader.nextInt();
		int k = reader.nextInt();

		int nx = Math.abs(x);
		int ny = Math.abs(y);
		int d = Math.abs(x - y);

		int timeA = ny + d;

		int timeB;
		if (d <= k) {
			timeB = nx + d;
		} else {
			timeB = nx + k + (d - k) * 2;
		}

		int ans = Math.min(timeA, timeB);

		System.out.println(ans);

		reader.close();
	}

}
