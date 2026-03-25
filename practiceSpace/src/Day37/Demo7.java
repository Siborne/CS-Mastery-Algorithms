package Day37;

public class Demo7 {

	public static void main(String[] args) {
		solve();
	}

	private static void solve() {
		int ans = 0;
		for (int i = 1; i < 2019 / 3; i++) {
			if (find(i)) {
				for (int j = i + 1; j < 2019 / 2; j++) {
					int k = 2019 - i - j;
					if (find(k) && find(j) && k > j) {
						ans++;
					}
				}
			}
		}
		System.out.println(ans);
	}

	private static boolean find(int n) {
		char[] chs = Integer.toString(n).toCharArray();
		for (int i = 0; i < chs.length; i++) {
			if (chs[i] == '2' || chs[i] == '4') {
				return false;
			}
		}
		return true;
	}

}
