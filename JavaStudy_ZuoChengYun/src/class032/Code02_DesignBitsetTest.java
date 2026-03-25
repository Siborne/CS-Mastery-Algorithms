package class032;

public class Code02_DesignBitsetTest {

	class Bitset {

		private int[] set;
		private final int size;
		private int zeros;
		private int ones;
		private boolean reverse;

		public Bitset(int size) {
			set = new int[(size + 31) / 32];
			this.size = size;
			zeros = size;
			ones = 0;
			reverse = false;
		}

		public void fix(int idx) {
			int index = idx / 32;
			int bit = idx % 32;
			if (!reverse) {
				if ((set[index] & (1 << bit)) == 0) {
					zeros--;
					ones++;
					set[index] |= (1 << bit);
				}
			} else {
				if ((set[index] & (1 << bit)) != 0) {
					zeros--;
					ones++;
					set[index] ^= (1 << bit);
				}
			}
		}

		public void unfix(int idx) {
			int index = idx / 32;
			int bit = idx % 32;
			if (!reverse) {
				if ((set[index] & (1 << bit)) != 0) {
					zeros++;
					ones--;
					set[index] ^= (1 << bit);
				}
			} else {
				if ((set[index] & (1 << bit)) == 0) {
					zeros++;
					ones--;
					set[index] |= (1 << bit);
				}
			}
		}

		public void flip() {
			reverse = !reverse;
			int temp = zeros;
			zeros = ones;
			ones = temp;
		}

		public boolean all() {
			return ones == size;
		}

		public boolean one() {
			return ones > 0;
		}

		public int count() {
			return ones;
		}

		public String toString() {
			StringBuilder stringBuilder = new StringBuilder();
			for (int i = 0, k = 0, number, status; i < size; k++) {
				number = set[k];
				for (int j = 0; j < 32 && i < size; j++, i++) {
					status = (number >> j) & 1;
					status ^= reverse ? 1 : 0;
					stringBuilder.append(status);
				}
			}
			return stringBuilder.toString();
		}
	}

}
