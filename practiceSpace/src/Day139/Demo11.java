package Day139;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo11 {
	public String tictactoe(int[][] moves) {
		int[][] wins = { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 }, { 0, 3, 6 }, { 1, 4, 7 }, { 2, 5, 8 }, { 0, 4, 8 },
				{ 2, 4, 6 } };

		Set<Integer> A = new HashSet<>();
		Set<Integer> B = new HashSet<>();

		for (int i = 0; i < moves.length; i++) {
			int row = moves[i][0];
			int col = moves[i][1];
			int pos = row * 3 + col;
			if ((i & 1) == 0) {
				A.add(pos);
				if (checkWin(A, wins)) {
					return "A";
				}
			} else {
				B.add(pos);
				if (checkWin(B, wins)) {
					return "B";
				}
			}
		}
		return moves.length == 9 ? "Draw" : "Pending";
	}

	private static boolean checkWin(Set<Integer> set, int[][] wins) {
		for (int[] win : wins) {
			boolean flag = true;
			for (int pos : win) {
				if (!set.contains(pos)) {
					flag = false;
					break;
				}
			}
			if (flag) {
				return true;
			}
		}
		return false;
	}
}
