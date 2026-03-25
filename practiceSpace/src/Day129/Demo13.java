package Day129;

public class Demo13 {

	public static void main(String[] args) {
		int res = 0;

		for (int l = 1; l <= 2025; l++) {
			if (2025 % l != 0) {
				continue;
			}
			int w = 2025 / l;
			int c = (l + w) * 2;
			res = Math.max(res, c);
		}

		System.out.println(res);
	}

}
