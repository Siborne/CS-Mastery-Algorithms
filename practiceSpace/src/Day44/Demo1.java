package Day44;

import java.time.DayOfWeek;
import java.time.LocalDate;



public class Demo1 {

	public static void main(String[] args) {
		LocalDate start = LocalDate.of(2023, 1, 1);
		LocalDate end = LocalDate.of(2024, 1, 1);
		long ans = 0;
		while(start.isBefore(end)) {
			String day = String.valueOf(start.getDayOfMonth());
			String month = String.valueOf(start.getMonthValue());
			String week = String.valueOf(start.getDayOfWeek().getValue());
//			DayOfWeek week =start.getDayOfWeek();
//			int weekValue = week.getValue();
			if(day.contains("1")||month.contains("1")||week.contains("1")) {
				ans+=5;
			}else {
				ans++;
			}
			start=start.plusDays(1);
		}
		System.out.println(ans);
	}
	
}
