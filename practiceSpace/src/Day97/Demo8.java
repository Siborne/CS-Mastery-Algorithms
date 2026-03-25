package Day97;

import java.util.Scanner;

public class Demo8 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();

		int hours = n / 3600;
		int mins = n / 60 % 60;
		int s = n % 60;
		System.out.println(hours + ":" + mins + ":" + s);

		reader.close();
	}

}
