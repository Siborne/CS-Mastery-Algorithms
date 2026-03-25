package Day33;

public class Demo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}

	private static void solve() {
		int total = 236;
		
		for(int i = 1;i<total;i++) {
			int sum = 0;
			for(int age = i;sum<total;age++) {
				sum+=age;
				if(sum==total) {
					System.out.println(i);
					return;
				}
				if(sum>total) {
					break;
				}
			}
		}
		
	}

}
