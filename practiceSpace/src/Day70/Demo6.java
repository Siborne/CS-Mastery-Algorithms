package Day70;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int x = reader.nextInt();
			int y = reader.nextInt();
			System.out.println(Math.min(x, y) + " " + Math.max(x, y));
		}

		reader.close();
	}

}
