package Day132;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int c = reader.nextInt();
		while (c-- > 0) {
			int x = reader.nextInt();
			long res = 2L * x * x - x + 1;
			System.out.println(res);
		}

		reader.close();
	}

}
