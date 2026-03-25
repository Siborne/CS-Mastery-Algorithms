package Day103;

import java.util.Scanner;

public class Demo23 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		reader.nextLine();
		while (t-- > 0) {
			char[] chs = reader.nextLine().toCharArray();
			int onePart = 0;
			int zeroPart = 0;
			char prev = chs[0];
			if (prev == '0') {
				zeroPart++;
			} else {
				onePart++;
			}
			for (int i = 1; i < chs.length; i++) {
				if (chs[i] != prev) {
					if (chs[i] == '0') {
						zeroPart++;
					} else {
						onePart++;
					}
					prev = chs[i];
				}
			}
			if (zeroPart <= 2 || onePart <= 2) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

		reader.close();
	}

}
