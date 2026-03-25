package Day18;

public class Demo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans = 0;
		for (int i = 1; i <= 2025; i++) {
			if (i % 3 == 0 || i % 8 == 0 || i % 38 == 0) {
				ans++;
			}
		}
		System.out.println(ans);
	}

}
