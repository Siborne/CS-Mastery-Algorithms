package Day128;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int w = reader.nextInt();
		int h = reader.nextInt();
		int x1 = reader.nextInt();
		int y1 = reader.nextInt();
		int x2 = reader.nextInt();
		int y2 = reader.nextInt();

		if (x1 == x2) {
			System.out.println("0 " + y1 + " " + w + " " + y2);
		} else {
			System.out.println(x1 + " 0 " + x2 + " " + h);
		}

		reader.close();
	}

}
