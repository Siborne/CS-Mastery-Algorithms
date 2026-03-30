package week1.day7;

import java.util.Scanner;

public class T3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int yearN = n / 10000;
//		int monthN = (n / 100) % 100;
//		int dayN = n % 100;

		int nextPalidrome = -1;
		for (int year = yearN; year <= 9999; year++) {
			int rev = reverse(year);
			int month = rev / 100;
			int day = rev % 100;
			if (!isValidDate(year, month, day)) {
				continue;
			}
			int date = year * 10000 + rev;
			if (date > n) {
				nextPalidrome = date;
				break;
			}
		}

		int nextABAB = -1;
		for (int A = 1; A <= 9; A++) {
			for (int B = 0; B <= 9; B++) {
				int year = 1000 * A + 100 * B + 10 * A + B;
				if (year < 1000 || year > 9999) {
					continue;
				}
				int month = 10 * B + A;
				int day = 10 * B + A;
				if (!isValidDate(year, month, day)) {
					continue;
				}
				int date = year * 10000 + month * 100 + day;
				if (date > n) {
					if (nextABAB == -1 || date < nextABAB) {
						nextABAB = date;
					}
				}
			}
		}
		System.out.println(nextPalidrome);
		System.out.println(nextABAB);
		reader.close();
	}

	private static boolean isValidDate(int year, int month, int day) {
		if (month < 1 || month > 12) {
			return false;
		}
		if (day < 1) {
			return false;
		}
		int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			daysInMonth[1] = 29;
		} else {
			daysInMonth[1] = 28;
		}
		return day <= daysInMonth[month - 1];
	}

	private static int reverse(int x) {
		return (x % 10) * 1000 + ((x) / 10 % 10) * 100 + ((x / 100) % 10) * 10 + (x / 1000);
	}

}
