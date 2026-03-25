package Day129;

public class Demo2 {

	public static void main(String[] args) {
		int cnt = 0;
		for (int i = 1000; i <= 20250412; i++) {
			if (isok(i)) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

	private static boolean isok(int x) {
		int zero = 0;
		int two = 0;
		int five = 0;
		while (x != 0) {
			int tmp = x % 10;
			if (tmp == 0) {
				zero++;
			} else if (tmp == 2) {
				two++;
			} else if (tmp == 5) {
				five++;
			}
			x /= 10;
		}
		return zero >= 1 && two >= 2 && five >= 1;
	}

}
