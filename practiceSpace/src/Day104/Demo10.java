package Day104;

import java.time.LocalDate;
import java.util.Scanner;

public class Demo10 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		String[] line = reader.nextLine().split("-");
		LocalDate date = LocalDate.of(Integer.valueOf(line[0]), Integer.valueOf(line[1]), Integer.valueOf(line[2]));
		date = date.plusYears(10);
		System.out.println(date.getYear() + "-" + String.format("%02d", date.getMonthValue()) + "-"
				+ String.format("%02d", date.getDayOfMonth()));
		reader.close();
	}

}
