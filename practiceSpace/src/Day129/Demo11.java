package Day129;

import java.util.Scanner;

public class Demo11 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		char c = reader.nextLine().charAt(1);
		int h = 1189;
		int w = 841;
		int cnt = 0;

		while (cnt < c - '0') {
			if ((cnt & 1) == 0) {
				h /= 2;
			} else {
				w /= 2;
			}
			cnt++;
		}

		if ((c & 1) == 0) {
			System.out.println(h);
			System.out.println(w);
		} else {
			System.out.println(w);
			System.out.println(h);
		}

		reader.close();
	}

}
