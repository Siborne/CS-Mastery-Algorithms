package Day84;

import java.util.Scanner;

public class Demo28 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int ans = n * (n + 1) / 2 + 1;
		System.out.println(ans);

		reader.close();
	}

}
