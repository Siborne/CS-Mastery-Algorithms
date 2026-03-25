package Day123;

public class Demo1 {

	public static void main(String[] args) {
		for (int i = 1000000; i > 1; i--) {
			if (check(i)) {
				System.out.println(i);
				break;
			}
		}
	}

	private static boolean check(int u) {
		String t = String.valueOf(u);
		for (int i = 0; i < t.length(); i++) {
			for (int j = i; j < t.length(); j++) {
				int tmp = Integer.parseInt(t.substring(i, j + 1));
				if (!isPrime(tmp)) {
					return false;
				}
			}
		}
		return true;
	}

	private static boolean isPrime(int u) {
		if (u == 1)
			return false;
		for (int i = 2; i * i <= u; i++) {
			if (u % i == 0) {
				return false;
			}
		}
		return true;
	}

}
