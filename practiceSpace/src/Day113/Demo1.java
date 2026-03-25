package Day113;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		if (n == 0) {
			System.out.println(0);
		} else {
			System.out.println((n - 1) % 9 + 1);
		}
		reader.close();
	}

}
