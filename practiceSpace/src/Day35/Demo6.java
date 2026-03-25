package Day35;

public class Demo6 {

	private static int count = 0;
	private static boolean visited[][];

	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				visited = new boolean[4][4];
				visited[i][j] = true;
				dfs(i, j, 15);
				visited[i][j] = false;
			}
		}
		System.out.println(count);
	}

	private static int[][] dicts = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };

	private static void dfs(int x, int y, int l) {
		if (l == 0) {
			count++;
			return;
		}
		
		for(int i = 0;i<dicts.length;i++) {
			int newX = x + dicts[i][0];
			int newY = y + dicts[i][1];
			if(inGrip(newX,newY)&&!visited[newX][newY]) {
				visited[newX][newY] = true;
				dfs(newX,newY,l-1);
				visited[newX][newY] = false;
			}
		}

	}

	private static boolean inGrip(int x, int y) {
		return x >= 0 && y >= 0 && x < 4 && y < 4;
	}

}
