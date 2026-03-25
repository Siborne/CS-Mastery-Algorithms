package Day118;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int a = reader.nextInt();
			int b = reader.nextInt();
			int c = reader.nextInt();
			int d = reader.nextInt();
			int x = b;
			int y = c;
			int z = c;
			System.out.println(x + " " + y + " " + z);
		}

		reader.close();
	}

}
