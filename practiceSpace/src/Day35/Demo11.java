package Day35;

import java.util.Scanner;

public class Demo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int m = reader.nextInt();
		
		int[][] arr = new int[n][m];
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<m;j++) {
				arr[i][j] = reader.nextInt();
			}
		}
		
		for(int i = 0;i<m;i++) {
			for(int j = n-1;j>=0;j--) {
				System.out.print(arr[j][i] +" ");
			}
			System.out.println();
		}
		
		reader.close();
	}

}
