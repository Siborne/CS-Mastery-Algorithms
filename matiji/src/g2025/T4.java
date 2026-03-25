package g2025;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class T4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int m = reader.nextInt();
		int[][] nm = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				nm[i][j] = reader.nextInt();
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				Set<Integer> set = new HashSet<>();
				for(int l = 0;l<=i;l++) {
					for(int r = 0;r<=j;r++) {
						set.add(nm[l][r]);
					}
				}
				System.out.print(set.size()+" ");
			}
			System.out.println();
		}
		reader.close();
	}

}
