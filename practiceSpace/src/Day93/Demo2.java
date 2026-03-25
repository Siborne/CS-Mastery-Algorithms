package Day93;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		System.out.println((n & 1) == 1 ? "N" : "Y");

		reader.close();
	}

}
