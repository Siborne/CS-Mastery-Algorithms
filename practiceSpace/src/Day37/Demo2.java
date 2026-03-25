package Day37;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}
	
	private static void solve() {
		int num = 1;
		while(true) {
			int count = 0;
			for(int i = 1;i*i<=num/2;i++) {
				int j = num - i*i;
				int k = (int)Math.sqrt(j);
				if(k*k==j) {
					count++;
				}
				if(count==12) {
					System.out.println(num);
					return;
				}
			}
			num++;
		}
		
	}

}
