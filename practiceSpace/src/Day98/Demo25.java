package Day98;

import java.util.Scanner;

public class Demo25 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int x = reader.nextInt();
		int y = reader.nextInt();
		int n = reader.nextInt();
		while (n-- > 0) {
			if (x >= y) {
				y += x / 2;
				x -= x / 2;
			} else {
				x += y / 2;
				y -= y / 2;
			}
		}
		System.out.println(x + " " + y);
		reader.close();
	}

}
