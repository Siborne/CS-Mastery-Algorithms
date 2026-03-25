package Day85;

import java.util.Scanner;

public class Demo8 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int x = 0;
		int y = 0;
		char[] chs = reader.nextLine().toCharArray();
		for (char ch : chs) {
			if (ch == 'U') {
				y++;
			} else if (ch == 'D') {
				y--;
			} else if (ch == 'L') {
				x--;
			} else if (ch == 'R') {
				x++;
			}
		}
		System.out.println(x + " " + y);

		reader.close();
	}

}
