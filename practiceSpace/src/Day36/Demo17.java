package Day36;

public class Demo17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}
	
	public static void solve() {
		double speedA = 10;
		double speedB = 10;
		double length = 1000;
		double speedBird = 50;
		double time = 0;
		int ans = 0;
		while(length>1) {
			time = length / (speedBird+speedA);
			length-=(speedA+speedB)*time;
			ans++;
		}
		System.out.println(ans/2);
		
	}

}
