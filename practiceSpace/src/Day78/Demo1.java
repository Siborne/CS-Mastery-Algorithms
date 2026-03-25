package Day78;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int x = 0;
			int y = 0;
			int n = reader.nextInt();
			reader.nextLine();
			char[] chs = reader.nextLine().toCharArray();
			boolean flag = false;
			for (char c : chs) {
				if (c == 'U') {
					y++;
				} else if (c == 'D') {
					y--;
				} else if (c == 'L') {
					x--;
				} else if (c == 'R') {
					x++;
				}
				if(x==1&&y==1) {
					flag = true;
					break;
				}
			}
			
			System.out.println(flag?"YES":"NO");

		}

		reader.close();
	}

}
