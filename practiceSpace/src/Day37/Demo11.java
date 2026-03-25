package Day37;

public class Demo11 {

	private static int[][] ans = new int[7][7];
	private static int count = 0;
	private static int[][] dicts = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

	public static void main(String[] args) {
		ans[3][3] = 1;
		dfs(3, 3);
		System.out.println(count / 4);
	}

	private static void dfs(int i, int j) {
		if (i == 0 || i == 6 || j == 0 || j == 6) {
			count++;
			return;
		}

		for (int k = 0; k < 4; k++) {
			int x = i + dicts[k][0];
			int y = j + dicts[k][1];
			if(ans[x][y]!=1) {
				ans[x][y] =1;
				ans[6-x][6-y]=1;
				dfs(x,y);
				ans[x][y]=0;
				ans[6-x][6-y]=0;
			}
		}
	}

}
