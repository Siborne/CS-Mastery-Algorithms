package class043;

public class Code03_IsPalindrome {
	public boolean isPalindrome1(int x) {
		if (x < 0) {
			return false;
		}
		int offset = 1;
		while (x / offset >= 10) {
			offset *= 10;
		}
		while (x != 0) {
			if (x / offset != x % 10) {
				return false;
			}
			x = (x % offset) / 10;
			offset /= 100;
		}
		return true;
	}

	public boolean isPalindrome2(int x) {
		if (x < 0 || (x % 10 == 0 && x != 0)) {
			return false;
		}

		int revertedNumber = 0;
		while (x > revertedNumber) {
			revertedNumber = revertedNumber * 10 + x % 10;
			x /= 10;
		}
		return x == revertedNumber || x == revertedNumber / 10;
	}
}
