package Round_101;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();

		long pthb = 0;
		long hshb = 0;

		long pttg = 0;
		long dltg = 0;

		if (n < 20) {
			pthb = n / 5 * 2;
			hshb = n < 15 ? (n < 5 ? 0 : 1) : 2;
			pttg = 0;
			dltg = n * 2;
		} else {
			int lun = n / 20;
			pthb = 8 * lun + (n - lun * 20) / 5 * 2;
			hshb = 2 * lun + (n - lun * 20 < 15 ? (n - lun * 20 < 5 ? 0 : 1) : 2);
			pttg = lun * 3;
			dltg = (n - lun) * 2;
		}

		System.out.println(pthb + " " + hshb + " " + pttg + " " + dltg);

		reader.close();
	}

}
