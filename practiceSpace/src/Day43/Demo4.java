package Day43;

import java.time.LocalDate;
import java.util.Scanner;

public class Demo4 {
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int l = reader.nextInt();
		int r = reader.nextInt();
		LocalDate start = LocalDate.of(l, 1, 1);
		LocalDate end = LocalDate.of(r+1, 1, 1);
		long ans = 0;
		while(start.isBefore(end)) {
			String year = String.valueOf(start.getYear());
			if(year.contains("4931")) {
				ans+=Long.parseLong(year);
			}
			start = start.plusYears(1);
		}
		System.out.println(ans);
		reader.close();
	}
	
}
