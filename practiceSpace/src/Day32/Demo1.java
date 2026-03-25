package Day32;

public class Demo1 {
	private static boolean state[][] = { { true, true, true, true, true, true, false },
			{ false, true, true, false, false, false, false }, { true, true, false, true, true, false, true },
			{ true, true, true, true, false, false, true }, { false, true, true, false, false, true, true },
			{ true, false, true, true, false, true, true }, { true, false, true, true, true, true, true },
			{ true, true, true, false, false, false, false }, { true, true, true, true, true, true, true, true },
			{ true, true, true, true, false, true, true } };

	private static String[] arr = { "", "0000011", "1001011", "0000001", "0100001", "0101011", "0110110", "1111111",
			"0010110", "0101001", "0010110", "1011100", "0100110", "1010000", "0010011", "0001111", "0101101",
			"0110101", "1101010" };

	private static void solve() {
		long ans = 1;

		for (int i = 1; i <= 18; i++) {
			int cnt = 0;
			String numStr = arr[i];
			for (int j = 0; j <= 9; j++) {
				int k = 0;
				for (k = 0; k < numStr.length(); k++) {
					if (numStr.charAt(k) == '1' && !state[j][k]) {
						break;
					}
				}
				if (k == numStr.length()) {
					cnt++;
				}
			}
			ans = ans * cnt;
		}

		System.out.println(ans);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

}
