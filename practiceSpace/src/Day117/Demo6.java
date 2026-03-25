package Day117;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int n = reader.nextInt();
			int m = reader.nextInt();

			int res = (n * m + 1) / 2;
			System.out.println(res);
		}

		reader.close();
	}

}
