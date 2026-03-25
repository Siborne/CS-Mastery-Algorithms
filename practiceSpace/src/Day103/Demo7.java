package Day103;

import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int a = reader.nextInt();
		a = Math.abs(a);
		System.out.println(a % 10);

		reader.close();
	}

}
