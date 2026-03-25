package Day41;

import java.time.LocalDate;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate start = LocalDate.of(1900, 1, 1);
		LocalDate end = LocalDate.of(9999, 12, 31);
		long ans = 0L;
		while (start.isBefore(end)) {
			int year = start.getYear();
			int month = start.getMonthValue();
			int day = start.getDayOfMonth();
			int left = getNumber(year);
			int right = getNumber(month)+getNumber(day);
			if(left==right) {
				ans++;
			}
			
			start = start.plusDays(1);
		}

		System.out.println(ans);
	}

	private static int getNumber(int n) {
		int res = 0;
		while (n > 0) {
			res += n % 10;
			n /= 10;
		}
		return res;
	}

}
