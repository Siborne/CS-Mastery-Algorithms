package Day119;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int n = reader.nextInt();
			int[] res = new int[3];
			boolean flag = false;
			for (int i = 2; i * i < n; i++) {
				if (n % i != 0) {
					continue;
				}
				int temp = n / i;
				res[0] = i;
				for (int j = i+1; j * j < temp; j++) {
					if (temp % j != 0) {
						continue;
					}
					res[1] = j;
					res[2] = temp / j;
					flag = true;
					break;
				}
				if (flag) {
					break;
				}
			}
			if (flag) {
				System.out.println("YES");
				for (int i = 0; i < res.length; i++) {
					System.out.print(res[i] + " ");
				}
				System.out.println();
			} else {
				System.out.println("NO");
			}
		}

		reader.close();
	}

}
