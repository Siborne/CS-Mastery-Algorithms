package Day74;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int n = reader.nextInt();
		int m = reader.nextInt();
		int k = reader.nextInt();
		
		int[][] arr =new int[n+1][m+1];
		int[] total = new int[k+2];
		boolean[][] vis = new boolean[m+1][k+4];
		
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=m;j++) {
				arr[i][j] = reader.nextInt();
			}
		}
		
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=m;j++) {
				int val = arr[i][j];
				if(!vis[j][val]) {
					vis[j][val] = true;
					total[val]++;
				}
			}
		}
		
		for(int i = 1;i<=k;i++) {
			System.out.print(total[i]+" ");
		}
		
		reader.close();
	}
	
}
