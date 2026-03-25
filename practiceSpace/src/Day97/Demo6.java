package Day97;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int a = reader.nextInt();
		int b = reader.nextInt();
		int c = reader.nextInt();

		System.out.println(a + b > c ? "yes" : "no");

		reader.close();
	}

}
