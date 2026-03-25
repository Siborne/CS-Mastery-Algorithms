package Day33;

public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}
	
	private static void solve() {
		int number = 0;
		for(int i = 1;i<999;i++) {
			int j = i*i*i;
			int b = 0;
			while(j>0) {
				b+=j%10;
				j/=10;
			}
			if(b==i) {
				number++;
			}
		}
		System.out.println(number);
	}

}
