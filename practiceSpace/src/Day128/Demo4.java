package Day128;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		// 左下
		int x1 = reader.nextInt();
		int y1 = reader.nextInt();
		// 右上
		int x2 = reader.nextInt();
		int y2 = reader.nextInt();
		// 左下
		int x3 = reader.nextInt();
		int y3 = reader.nextInt();
		// 右上
		int x4 = reader.nextInt();
		int y4 = reader.nextInt();

		int w = reader.nextInt();
		int h = reader.nextInt();

		boolean flag = false;

		if (x3 - x1 >= w && y2 - y1 >= h) {
			flag = true;
		}

		if (x2 - x4 >= w && y2 - y1 >= h) {
			flag = true;
		}

		if (y3 - y1 >= h && x2 - x1 >= w) {
			flag = true;
		}

		if (y2 - y4 >= h && x2 - x1 >= w) {
			flag = true;
		}

		if (flag) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		reader.close();
	}

}
