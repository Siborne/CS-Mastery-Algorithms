package Day39;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int w = reader.nextInt();
		int m = reader.nextInt();
		int n = reader.nextInt();

		int rowM = (m - 1) / w;
		int colM = (rowM % 2 == 0) ? (m - 1) % w : (w - 1) - ((m - 1) % w);

		int rowN = (n - 1) / w;
		int colN = (rowN % 2 == 0) ? (n - 1) % w : (w - 1) - ((n - 1) % w);

		System.out.println(Math.abs(rowM - rowN) + Math.abs(colM - colN));

		reader.close();
	}

}
