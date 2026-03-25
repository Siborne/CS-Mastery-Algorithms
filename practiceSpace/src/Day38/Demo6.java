package Day38;

public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}
	
	private static void solve() {
		int count = 0;
		int i = 1;
		while(count<2023) {
			if(check(i,2)&&check(i,8)&&check(i,10)&&check(i,16)) {
				count++;
			}
			i++;
		}
		System.out.println(i-1);
		return;
	}
	
	private static boolean check(int x,int mod) {
		int n = x;
		int ans = 0;
		while(x>0) {
			ans += x%mod;
			x/=mod;
		}
		return n%ans == 0;
	}

}
