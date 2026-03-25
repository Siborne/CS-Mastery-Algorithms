package Day47;

public class Demo4 {

	private static final int SIZE = 5;
	private static int[][] a = new int[SIZE + 2][SIZE + 2];
	private static int ans = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dfs(1, 1);
		System.out.println(ans);
	}

	private static void dfs(int x, int y) {
		if (y > SIZE) {
			dfs(x + 1, 1);
			return;
		}
		if (x > SIZE) {
			if (!check()) {
				ans++;
			}
			return;
		}

		a[x][y] = 1;
		dfs(x, y + 1);
		a[x][y] = 0;

		a[x][y] = 2;
		dfs(x, y + 1);
		a[x][y] = 0;
	}
	
	private static boolean check() {
		int cnt1 = 0;
		int cnt2 = 0;
		for(int i = 1;i<=SIZE;i++) {
			for(int j= 1;j<=SIZE;j++) {
				if(a[i][j]==1) {
					cnt1++;
				}
				if(a[i][j]==2){
					cnt2++;
				}
			}
		}
		
		if(cnt1 != cnt2 + 1) {
			return true;
		}
		
		for(int i = 1;i<=SIZE;i++) {
			boolean flag = true;
			for(int j = 1;j<=SIZE;j++) {
				if(a[i][j]!=a[i][1]) {
					flag = false;
					break;
				}
			}
			if(flag) {
				return true;
			}
		}
		
		for(int i = 1;i<=SIZE;i++) {
			boolean flag = true;
			for(int j = 1;j<=SIZE;j++) {
				if(a[j][i]!=a[1][i]) {
					flag = false;
					break;
				}
			}
			if(flag) {
				return true;
			}
		}
		
		boolean flag = true;
		for(int i = 1;i<=SIZE;i++) {
			if(a[i][i]!=a[1][1]) {
				flag = false;
				break;
			}
		}
		if(flag) {
			return true;
		}
		
		flag = true;
		for(int i = SIZE,j=1;j>=1&&j<=SIZE;i--,j++) {
			if(a[i][j]!=a[SIZE][1]) {
				flag = false;
				break;
			}
		}
		return flag;
		
	}

}
