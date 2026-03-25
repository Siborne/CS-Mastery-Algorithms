package Day33;

import java.time.LocalDate;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

	private static void solve() {
		LocalDate start = LocalDate.of(1901, 1, 1);
		LocalDate end = LocalDate.of(2000, 12, 31);
		int sum = 0;
		while(!start.isAfter(end)) {
			int x = start.getDayOfWeek().getValue();
			if(x==1) {
				sum++;
			}
			start = start.plusDays(1);
		}
		System.out.println(sum);
	}
}
