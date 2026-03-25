package Day38;

import java.time.LocalDate;

public class Demo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}
	
	private static void solve() {
		LocalDate start = LocalDate.of(2000, 1, 1);
		LocalDate end = LocalDate.of(2000000, 1, 2);
		long ans = 0;
		while(start.isBefore(end)) {
			int yy = start.getYear();
			int mm = start.getMonthValue();
			int dd = start.getDayOfMonth();
			if(yy%mm==0&&yy%dd==0) {
				ans++;
			}
			start = start.plusDays(1);
		}
		System.out.println(ans);
	}

}
