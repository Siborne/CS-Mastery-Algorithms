package Day128;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int cnt = n;
		while (n / 3 > 0) {
			cnt += n / 3;
			n = n % 3 + n / 3;
		}
		System.out.println(cnt);

		reader.close();
	}

}
