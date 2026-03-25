package Day36;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Demo13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}
	
	private static void solve() {
		LocalDate start = LocalDate.of(2000, 1, 1);
		LocalDate end = LocalDate.of(2020, 10, 2);
		int ans = 0;
		while(true) {
			if(start.isEqual(end)) {
				break;
			}else {
				int dayOfMonth = start.getDayOfMonth();
				DayOfWeek dayOfWeek = start.getDayOfWeek();
				
//				System.out.println(dayOfWeek.toString());
				if(dayOfMonth==1||dayOfWeek.equals(DayOfWeek.MONDAY)) {
					ans++;
				}
				ans++;
				start = start.plusDays(1);
			}
		}
		System.out.println(ans);
	}

}
