package Day33;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}
	
	private static void solve() {
		int ans = 0;
		for(int i = 1;i<=2020;i++) {
			if(isCompositeNumber(i)) {
				ans++;
			}
		}
		System.out.println(ans);
	}
	
	private static boolean isCompositeNumber(int n) {
		if(n<=2) {
			return false;
		}
		for(int i = 2;i*i<=n;i++) {
			if(n%i==0) {
				return true;
			}
		}
		return false;
	}
	

}
