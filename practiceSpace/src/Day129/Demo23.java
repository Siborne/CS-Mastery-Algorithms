package Day129;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class Demo23 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		Map<Integer, String> map = new HashMap<>();
		map.put(0, "Monday");
		map.put(1, "Tuesday");
		map.put(2, "Wednesday");
		map.put(3, "Thursday");
		map.put(4, "Friday");

		while (t-- > 0) {
			int year1 = reader.nextInt();
			int month1 = reader.nextInt();
			int date1 = reader.nextInt();
			String s = reader.next();
			int baseDay = 0;
			for (Entry<Integer, String> entry : map.entrySet()) {
				if (entry.getValue().equals(s)) {
					baseDay = entry.getKey();
				}
			}
			int year2 = reader.nextInt();
			int month2 = reader.nextInt();
			int date2 = reader.nextInt();

			int yearDiff = year2 - year1;
			int monthDiff = month2 - month1;
			int dateDiff = date2 - date1;

			long totalDays = (long) yearDiff * 360 + monthDiff * 30 + dateDiff;
			long target = (baseDay + totalDays) % 5;
			if (target < 0) {
				target += 5;
			}
			System.out.println(map.get((int) target));
		}

		reader.close();
	}

}
