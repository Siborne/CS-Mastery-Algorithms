package Day43;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int s = reader.nextInt();
		int e = reader.nextInt();
		int d = reader.nextInt();
		int ans;
		if (e > s) {
			ans = e - s;
		} else {
			ans = n - (s - e);
		}

		int sd = (s + d + n) % n;
		int temp = Integer.MAX_VALUE;
		if (e > sd) {
			temp = e - sd;
		} else {
			temp = n - (sd - e);
		}

		int ds = (s - d + n) % n;
		if (e > ds) {
			temp = Math.min(temp, e - ds);
		} else {
			temp = Math.min(temp, n - (ds - e));
		}

		ans = Math.min(ans, temp);
		System.out.println(ans);

		reader.close();
	}

}
