package Day131;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class Demo6 {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

	private static Map<String, Integer> MONTH_TO_INDEX = new HashMap<>();
	private static final int[] DAYS_IN_MONTH = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	static {
		MONTH_TO_INDEX.put("JAN", 1);
		MONTH_TO_INDEX.put("FEB", 2);
		MONTH_TO_INDEX.put("MAR", 3);

		MONTH_TO_INDEX.put("APR", 4);
		MONTH_TO_INDEX.put("MAY", 5);
		MONTH_TO_INDEX.put("JUN", 6);

		MONTH_TO_INDEX.put("JUL", 7);
		MONTH_TO_INDEX.put("AUG", 8);
		MONTH_TO_INDEX.put("SEP", 9);

		MONTH_TO_INDEX.put("OCT", 10);
		MONTH_TO_INDEX.put("NOV", 11);
		MONTH_TO_INDEX.put("DEC", 12);
	}

	public static void main(String[] args) throws IOException {
		String line = reader.readLine();

		int i = 0;
		while (i < line.length() && Character.isDigit(line.charAt(i))) {
			i++;
		}

		String dayStr = line.substring(0, i);
		int j = i;
		while (j < line.length() && Character.isLetter(line.charAt(j))) {
			j++;
		}
		String monthStr = line.substring(i, j);
		String yearStr = line.substring(j);

		int day = Integer.parseInt(dayStr);
		int month = MONTH_TO_INDEX.get(monthStr);
		int year = Integer.parseInt(yearStr);

		long totalDays = 0;

		for (int y = 1; y < year; y++) {
			totalDays += isLeapOld(y) ? 366 : 365;
		}

		for (int m = 1; m < month; m++) {
			totalDays += DAYS_IN_MONTH[m - 1];
			if (m == 2 && isLeap(year)) {
				totalDays += 1;
			}
		}

		totalDays += (day - 1);

		if (year > 1582) {
			totalDays -= 10;
		} else if (year == 1582) {
			if (month > 10) {
				totalDays -= 10;
			} else if (month == 10 && day >= 15) {
				totalDays -= 10;
			}
		}
		writer.println(totalDays);
		writer.flush();
		writer.close();
		reader.close();
	}

	private static boolean isLeap(int year) {
		if (year < 1582) {
			return year % 4 == 0;
		} else {
			return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
		}
	}

	private static boolean isLeapOld(int year) {
		return year % 4 == 0;
	}

}
