package Day84;

import java.util.Scanner;

public class Demo16 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		String nStr = String.valueOf(n);
		boolean flag = true;
		for (int i = 1; i <= 9; i++) {
			if (i == 4 || i == 7) {
				continue;
			}
			if (nStr.contains(String.valueOf(i))) {
				flag = false;
			}
		}
		if (flag) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		reader.close();
	}

}
