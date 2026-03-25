package Day121;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		long n = reader.nextLong();
		n /= 1000;
		n = n % (24 * 60 * 60);

		long hour = n / (60 * 60);
		n = n % (60 * 60);
		long min = n / 60;
		long s = n % 60;
		System.out.println(String.format("%02d:%02d:%02d", hour, min, s));

		reader.close();
	}

}
