package Day45;

import java.util.Scanner;

public class Demo6 {

	private static char[][] s;
	private static boolean flag;
	private static int n;
	private static int[][] f1;
	private static int[][] f2;
	private static int[] A;

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		n = reader.nextInt();
		s = new char[11][11];
		f1 = new int[11][2];
		f2 = new int[11][2];
		A = new int[2048];
		flag = false;
		
		for(int i = 1;i<=n;i++) {
			String str = reader.next();
			for(int j = 1;j<=n;j++) {
				s[i][j] = str.charAt(j-1);
				if(s[i][j]!='_') {
					f1[i][s[i][j]-'0']++;
					f2[j][s[i][j]-'0']++;
				}
			}
		}
		
		bfs(1,1);
		reader.close();
	}
	
	private static void bfs(int x,int y) {
		if(flag) {
			return;
		}
		
		if(x == n+1 && y == 1) {
			boolean res = true;
			
			for(int i = 1;i<=n;i++) {
				int xVal = 0;
				for(int j = 1;j<=n;j++) {
					
				}
			}
			
		}
	}

}
