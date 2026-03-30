package week1.day7;

import java.time.LocalDate;
import java.util.Scanner;

public class T2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();

		LocalDate start = LocalDate.of(2000, 1, 1);
		LocalDate end = LocalDate.of(2023, 4, 20);

		int cnt = 0;
		for (LocalDate date = start; !date.isAfter(end); date = date.plusDays(1)) {
			int year = date.getYear();
			int month = date.getMonthValue();
			int day = date.getDayOfMonth();
			int num = year * 10000 + month * 100 + day;

			int root = digitalRoot(num);
			if (root == n) {
				cnt++;
			}
		}
		System.out.println(cnt);
		reader.close();
	}

	private static int digitalRoot(int x) {
		if (x == 0)
			return 0;
		return 1 + (x - 1) % 9;
	}

}
