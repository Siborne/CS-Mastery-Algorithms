package Day104;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int a1 = reader.nextInt();
		int a2 = reader.nextInt();
		int a3 = reader.nextInt();
		if (a1 > a2 && a2 < a3) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		reader.close();
	}

}
