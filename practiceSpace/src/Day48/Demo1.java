package Day48;

import java.time.LocalDate;

public class Demo1 {

	public static void main(String[] args) {
		LocalDate start = LocalDate.of(1949, 10, 1);
		LocalDate end = LocalDate.of(2022, 1, 2);
		long ans = 0L;
		while(start.isBefore(end)) {
			ans++;
			start = start.plusDays(1);
		}
		System.out.println(ans);
	}
	
}
