package Day113;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String target = reader.nextLine().toLowerCase();
		String[] str = reader.nextLine().toLowerCase().split(" ");
		int index = -1;
		int tempIndex = 0;
		int cnt = 0;
		for (int i = 0; i < str.length; i++) {
			if (!target.equals(str[i])) {
				tempIndex += str[i].length() + 1;
				continue;
			}
			if (index == -1) {
				index = tempIndex;
			}
			cnt++;
		}
		if (cnt == 0 && index == -1) {
			System.out.println(-1);
		} else {
			System.out.println(cnt + " " + index);
		}

		reader.close();
	}

}
