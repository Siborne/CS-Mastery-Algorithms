package Day134;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int w = reader.nextInt();
		int m = reader.nextInt();
		int n = reader.nextInt();
		int mRow = (m - 1) / w;
		int nRow = (n - 1) / w;

		int mCol = 0;
		if (mRow % 2 == 0) {
			mCol = (m - 1) % w;
		} else {
			mCol = w - 1 - ((m - 1) % w);
		}

		int nCol = 0;
		if (nRow % 2 == 0) {
			nCol = (n - 1) % w;
		} else {
			nCol = w - 1 - ((n - 1) % w);
		}
		int ans = Math.abs(mRow - nRow) + Math.abs(mCol - nCol);
		System.out.println(ans);

		reader.close();
	}

}
