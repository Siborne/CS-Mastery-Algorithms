package Day141;

public class Demo6 {
	public boolean checkStraightLine(int[][] coordinates) {
		int n = coordinates.length;
		if (n <= 2) {
			return true;
		}
		int x0 = coordinates[0][0];
		int y0 = coordinates[0][1];

		int x1 = coordinates[1][0];
		int y1 = coordinates[1][1];
		for (int i = 2; i < n; i++) {
			if ((coordinates[i][1] - y0) * (x1 - x0) != (y1 - y0) * (coordinates[i][0] - x0)) {
				return false;
			}
		}
		return true;
	}
}
