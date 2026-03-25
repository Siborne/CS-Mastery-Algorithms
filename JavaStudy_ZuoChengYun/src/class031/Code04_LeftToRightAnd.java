package class031;

public class Code04_LeftToRightAnd {
	public int rangeBitwiseAnd(int left, int right) {
		while (left < right) {
			right -= right & -right;
		}
		return right;
	}
}
