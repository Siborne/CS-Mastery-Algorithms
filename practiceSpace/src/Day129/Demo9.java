package Day129;

import java.util.Scanner;

public class Demo9 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
//		long res = (n + 24L + n) * 25 / 2;
		long res = 25L * n + 300L;
		System.out.println(res);
		reader.close();
	}

}
