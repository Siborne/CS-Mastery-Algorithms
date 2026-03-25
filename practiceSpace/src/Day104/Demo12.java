package Day104;

import java.util.Scanner;

public class Demo12 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int k = reader.nextInt();

		if (k <= n - 1) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		reader.close();
	}

}
