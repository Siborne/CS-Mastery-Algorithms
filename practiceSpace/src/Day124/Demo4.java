package Day124;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		while (reader.hasNextInt()) {
			int n = reader.nextInt();
			int m = reader.nextInt();
			int[][] studentScore = new int[n][m];
			double[] nrr = new double[n];
			double[] mrr = new double[m];
			for (int i = 0; i < nrr.length; i++) {
				for (int j = 0; j < mrr.length; j++) {
					studentScore[i][j] = reader.nextInt();
					nrr[i] += studentScore[i][j];
					mrr[j] += studentScore[i][j];
				}
				nrr[i] /= m;
			}

			for (int i = 0; i < mrr.length; i++) {
				mrr[i] /= n;
			}

			int sum = 0;
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < nrr.length; i++) {
				sb.append(String.format("%.2f", nrr[i])).append(" ");
				boolean flag = true;
				for (int j = 0; j < mrr.length; j++) {
					if (studentScore[i][j] < mrr[j]) {
						flag = false;
						break;
					}
				}
				if (flag) {
					sum++;
				}
			}
			System.out.println(sb.toString());
			sb = new StringBuilder();
			for (int i = 0; i < mrr.length; i++) {
				sb.append(String.format("%.2f", mrr[i])).append(" ");
			}
			System.out.println(sb.toString());
			System.out.println(sum);

		}

		reader.close();
	}

}
