package Day130;

import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int T = reader.nextInt();
		while (T-- > 0) {
			int n = reader.nextInt();
			int m = reader.nextInt();
			reader.nextLine();
			String a = reader.nextLine().toLowerCase();
			String b = reader.nextLine().toLowerCase();
			int cnt = 0;
			int index = 0;
			while (index <= m - n) {
				int newIndex = b.indexOf(a, index);
				if (newIndex == -1) {
					break;
				}
				cnt++;
				index = newIndex + 1;
			}
			System.out.println(cnt);

		}

		reader.close();
	}

}
