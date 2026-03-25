package Day33;

import java.util.Calendar;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}
	
	private static void solve() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, 2000);
		calendar.set(Calendar.MONTH, Calendar.MAY);
		calendar.set(Calendar.DATE, 4);
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
	}

}
