package Day93;

import java.util.Scanner;

public class Demo16 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		if (n <= 5) {
			System.out.println(String.format("%.2f", 10.0));
		} else if (n <= 10) {
			System.out.println(String.format("%.2f", 10.0 + (n - 5) * 2));
		} else {
			System.out.println(String.format("%.2f", 10.0 + 10.0 + (n - 10) * 2.5));
		}
		reader.close();
	}

}
