package Day98;

import java.util.Scanner;

public class Demo10 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		System.out.println(n % 10 == 0 ? 0 : n * 2);
		reader.close();
	}

}
