package Day132;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		double[] D = new double[21];
		double[] fact = new double[21];

		D[1] = 0;
		D[2] = 1;
		fact[1] = 1;
		fact[2] = 2;
		for (int i = 3; i <= 20; i++) {
			D[i] = (i - 1) * (D[i - 1] + D[i - 2]);
			fact[i] = fact[i - 1] * i;
		}

		int c = reader.nextInt();
		while (c-- > 0) {
			int n = reader.nextInt();
			double prob = D[n] / fact[n];
			System.out.printf("%.2f%%\n", prob * 100);
		}

		reader.close();
	}

}
