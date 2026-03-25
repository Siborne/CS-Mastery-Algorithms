package Day123;

import java.util.Scanner;

public class Demo8 {

	private static int[] monthHaveDay = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		while (reader.hasNextLine()) {
			String line = reader.nextLine();
			String[] strs = line.split("/");
			int year = Integer.parseInt(strs[0]);
			int month = Integer.parseInt(strs[1]);
			int days = Integer.parseInt(strs[2]);
			int date = 0;
			for (int i = 1; i < month; i++) {
				date += monthHaveDay[i];
			}
			date += days;
			if ((year % 4 == 0 && year % 100 != 0 || year % 400 == 0) && month >= 3) {
				date += 1;
			}
			System.out.println(date);
		}

		reader.close();
	}

}
