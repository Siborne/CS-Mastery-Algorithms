package Day133;

import java.math.BigDecimal;
import java.util.Scanner;

public class Demo12 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		while (reader.hasNextBigDecimal()) {
			BigDecimal a = reader.nextBigDecimal();
			BigDecimal b = reader.nextBigDecimal();
			if (a.compareTo(b) == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

		reader.close();
	}

}
