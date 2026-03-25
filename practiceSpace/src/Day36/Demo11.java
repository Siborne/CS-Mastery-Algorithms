package Day36;

import java.time.LocalDate;

public class Demo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}
	
	private static void solve() {
		LocalDate start = LocalDate.of(2001,1, 1);
		LocalDate end = LocalDate.of(2022, 1, 1);
		int ans = 0;
		while(true) {
			if(start.isEqual(end)) {
				break;
			}else {
				if(isWanDate(start)) {
					ans++;
				}
				start = start.plusDays(1);
			}
		}
		System.out.println(ans);
	}
	
	private static boolean isWanDate(LocalDate date) {
		int year = date.getYear();
		int month = date.getMonthValue();
		int day = date.getDayOfMonth();
		int y1 = year/1000;
		int y2 = year /100%10;
		int y3 = year/10 %10;
		int y4 = year%10;
		int m1 = month/10;
		int m2 = month%10;
		int d1 = day/10;
		int d2 = day%10;
		int sum = y1+y2+y3+y4+m1+m2+d1+d2;
		String[] str = String.valueOf(Math.pow(sum, 1.0/2)).split("\\.");
		if(str[1].equals("0")) {
			return true;
		}
		return false;
	}

}
