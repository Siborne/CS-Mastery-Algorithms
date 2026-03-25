package Day125;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		long a = Math.abs(reader.nextLong());
		long b = reader.nextLong();
		if (b < 0) {
			System.out.println(-1 * a);
		} else {
			System.out.println(a);
		}

		reader.close();
	}

}
