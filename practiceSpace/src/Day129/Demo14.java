package Day129;

import java.util.Scanner;

public class Demo14 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int m = 1;
		while (m < n) {
			m *= 10;
		}
		System.out.println(m);
		reader.close();
	}

}
