package Day98;

import java.util.Scanner;

public class Demo15 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int num = reader.nextInt();
		boolean flag = false;
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("P");
		} else {
			System.out.println((num & 1) == 1 ? "O" : "E");
		}

		reader.close();
	}

}
