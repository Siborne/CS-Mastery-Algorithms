package Day129;

import java.util.Scanner;

public class Demo24 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int Kobayashi = 0;
			int Tohru = 0;
			int n = reader.nextInt();
			while (n-- > 0) {
				int x = reader.nextInt();
				if (x == 1) {
					Kobayashi++;
				} else if (x == 2) {
					Tohru++;
				} else if (x == 3) {
					Kobayashi++;
					Tohru++;
				} else {
					Kobayashi--;
					Tohru--;
				}
			}
			if (Kobayashi > Tohru) {
				System.out.println("Kobayashi");
			} else if (Kobayashi < Tohru) {
				System.out.println("Tohru");
			} else {
				System.out.println("Draw");
			}
		}

		reader.close();
	}

}
