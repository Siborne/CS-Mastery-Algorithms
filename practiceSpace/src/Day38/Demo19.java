package Day38;

import java.util.Scanner;

public class Demo19 {
	
	private static boolean[][] output= new boolean[5][5];
	private static int ans = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		output[0][0] = true;
		output[0][2] = true;
		output[0][4] = true;
		
		dfs(1,0);
		System.out.println(ans);
		
		reader.close();
	}
	
	private static void dfs(int x,int y) {
		if(y>=5-x) {
			x++;
			y=0;
		}
		
		if(x==5) {
			if(output[4][0]) {
				ans++;
			}
			return;
		}
		
		output[x][y] = output[x-1][y] ^ output[x-1][y+1];
		dfs(x,y+1);
		output[x][y] = output[x-1][y] | output[x-1][y+1];
		dfs(x,y+1);
		output[x][y] = output[x-1][y] & output[x-1][y+1];
		dfs(x,y+1);
		
	}

}
