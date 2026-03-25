package Day111;

import java.util.Scanner;

public class Demo16 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		if ((n & 1) == 1) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		reader.close();
	}

}
