package Day130;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int x1 = reader.nextInt();
		int y1 = reader.nextInt();
		int x2 = reader.nextInt();
		int y2 = reader.nextInt();
		int xDiff = x1 - x2;
		int yDiff = y1 - y2;

		int t = reader.nextInt();
		int cnt = 0;
		while (t-- > 0) {
			String s = reader.next();
			if (xDiff < 0 && s.equals("E")) {
				xDiff++;
				cnt++;
			}
			if (xDiff > 0 && s.equals("W")) {
				xDiff--;
				cnt++;
			}
			if (yDiff < 0 && s.equals("N")) {
				yDiff++;
				cnt++;
			}
			if (yDiff > 0 && s.equals("S")) {
				yDiff--;
				cnt++;
			}
		}
		System.out.println(xDiff == 0 && yDiff == 0 ? cnt : -1);
		reader.close();
	}

}
