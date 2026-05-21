package week3.day5;

import java.util.Scanner;

public class T1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println(getNum(reader.nextInt()));
		reader.close();
	}

	private static int getNum(int n) {
		return n == 1 ? 1 : n * getNum(n - 1);
	}

}
