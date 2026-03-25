package Day93;

import java.util.Scanner;

public class Demo10 {

	private static String[] arr = { "rat", "ox", "tiger", "rabbit", "dragon", "snake", "horse", "sheep", "monkey",
			"rooster", "dog", "pig" };

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();

		System.out.println(arr[(n - 4) % 12]);

		reader.close();
	}

}
