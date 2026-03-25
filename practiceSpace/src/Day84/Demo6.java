package Day84;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		System.out.println(n * n - n + 2);

		reader.close();
	}

}
