package Day93;

import java.util.Scanner;

public class Demo23 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int temp = n;
		int sum = 0;
		while (temp != 0) {
			sum += temp % 10;
			temp /= 10;
		}
		System.out.println(n % sum == 0 ? "YES" : "NO");

		reader.close();
	}

}
