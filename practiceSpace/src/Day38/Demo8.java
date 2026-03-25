package Day38;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Demo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}
	
	private static void solve() {
		LocalDate localDate = LocalDate.of(2014, 11, 9);
		LocalDate newDate = localDate.plusDays(1000);
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		System.out.println(formatter.format(newDate));
	}

}
