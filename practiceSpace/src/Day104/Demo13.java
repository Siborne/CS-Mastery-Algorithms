package Day104;

import java.util.Scanner;

public class Demo13 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int q = reader.nextInt();
		while (q-- > 0) {
			int m = reader.nextInt();
			int x = reader.nextInt();
			System.out.println((x - 1) % m + 1);
		}

		reader.close();
	}

}
