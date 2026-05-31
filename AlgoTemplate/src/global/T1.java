package global;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class T1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			long[] arr = new long[3];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = reader.nextLong();
			}
			Arrays.sort(arr);
			int cntA, cntB;
			int Va, Vb;
			cntA = reader.nextInt();
			cntB = reader.nextInt();
			Va = reader.nextInt();
			Vb = reader.nextInt();
			if (cntA > cntB) {
				int temp = Va;
				Va = Vb;
				Vb = temp;
				temp = cntA;
				cntA = cntB;
				cntB = temp;
			}
			long ans = 0;
			int maxA1 = (int) Math.min(cntA, arr[0] / Va);
			for (int a1 = 0; a1 <= maxA1; a1++) {
				int remA = cntA - a1;
				int maxA2 = (int) Math.min(remA, arr[1] / Va);
				for (int a2 = 0; a2 <= maxA2; a2++) {
					int remA2 = remA - a2;
					int a3Max = (int) Math.min(remA2, arr[2] / Va);

					long r1 = arr[0] - (long) a1 * Va;
					long r2 = arr[1] - (long) a2 * Va;
					long b1 = r1 / Vb;
					long b2 = r2 / Vb;
					long b12 = b1 + b2;

					long need = cntB - b12;
					int[] cands;

					if (need > 0) {
						long a3Lim = (arr[2] - need * Vb) / Va;
						if (a3Lim >= 0 && a3Lim < a3Max) {
							cands = new int[] { 0, (int) a3Lim, (int) (a3Lim + 1), a3Max };
						} else if (a3Lim < 0) {
							cands = new int[] { 0, a3Max };
						} else {
							cands = new int[] { a3Max };
						}
					} else {
						cands = new int[] { a3Max };
					}
					int last = -1;
					for (int a3 : cands) {
						if (a3 < 0 || a3 > a3Max || a3 == last) {
							continue;
						}
						last = a3;
						long r3 = arr[2] - (long) a3 * Va;
						long b3 = r3 / Vb;
						long totalB = Math.min(cntB, b12 + b3);
						long total = a1 + a2 + a3 + totalB;
						if (total > ans) {
							ans = total;
						}
					}
				}
			}
			System.out.println(ans);
		}

		reader.close();
	}

}
