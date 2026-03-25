package Day48;

import java.time.LocalDate;
import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int n = reader.nextInt();
		LocalDate start = LocalDate.of(2021, n, 1);
		LocalDate end = LocalDate.of(2021, n, 1);
		end = end.plusMonths(1);
		int ans = 0;
		while(start.isBefore(end)) {
			ans++;
			start = start.plusDays(1);
		}
		System.out.println(ans);
		
		reader.close();
	}
	
}
