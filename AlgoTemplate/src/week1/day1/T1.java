package week1.day1;

import java.util.Scanner;

public class T1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int a = reader.nextInt();
		int b = reader.nextInt();
		System.out.println(a / b + " " + a % b);

		reader.close();
	}

}
