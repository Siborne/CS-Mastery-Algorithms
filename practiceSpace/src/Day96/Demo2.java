package Day96;

import java.util.Scanner;

public class Demo2 {
	private static int i, j;
	private static int[][] a = new int[3][3];

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		for (i = 0; i < 3; i++)
			for (j = 0; j < 3; j++)
				a[i][j] = reader.nextInt();
		if (a[0][0] == 1 && a[1][1] == 1 && a[2][2] == 1 && a[0][1] == 0 && a[0][2] == 0 && a[1][0] == 0 && a[1][2] == 0
				&& a[2][0] == 0 && a[2][1] == 0)
			System.out.println("YES");
		else
			System.out.println("NO");
		reader.close();
	}

}
