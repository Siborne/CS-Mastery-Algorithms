package Day37;

import java.math.BigInteger;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

	private static void solve() {
		int ans = 0;
		for (int i = 1; i <= 200; i++) {
			int count = 0;
			BigInteger cur = new BigInteger(String.valueOf(i));
			while (true) {
				cur = cur.add(new BigInteger(new StringBuilder(String.valueOf(cur)).reverse().toString()));
				count++;
				String temp = String.valueOf(cur);
				if(temp.equals(new StringBuilder(temp).reverse().toString())) {
					break;
				}
				if(count>=1000) {
					ans = i;
					break;
				}
			}

		}
		System.out.println(ans);
		return;
	}

}
