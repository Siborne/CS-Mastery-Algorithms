package Day139;

public class Demo12 {
	public boolean isRobotBounded(String instructions) {
		int[][] dirs = new int[][] { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
		int fx = 0;
		int x = 0;
		int y = 0;
		int n = instructions.length();
		for (int i = 0; i < n; i++) {
			if ('R' == instructions.charAt(i)) {
				fx = (fx + 1) % 4;
			} else if ('L' == instructions.charAt(i)) {
				fx = (fx - 1 + 4) % 4;
			} else {
				x += dirs[fx][0];
				y += dirs[fx][1];
			}
		}
		return x == 0 && y == 0 || fx != 0;
	}
}
