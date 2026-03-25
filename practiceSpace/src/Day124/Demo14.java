package Day124;

import java.util.Scanner;

public class Demo14 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int m = reader.nextInt();
		long sum = n * m;
		if ((sum & 1) == 1) {
			System.out.println("akai");
		}else {
			System.out.println("yukari");
		}

		reader.close();
	}

}
