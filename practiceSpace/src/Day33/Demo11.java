package Day33;

public class Demo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

	public static void solve() {
		long ans = 0;
		int now = 1;
		ans += now;
		for(int i = 2;i<=100;i++) {
			now+=i;
			ans+=now;
		}
		System.out.println(ans);
	}
}
