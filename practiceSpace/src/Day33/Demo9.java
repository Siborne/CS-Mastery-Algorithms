package Day33;

import java.util.Scanner;

public class Demo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}
	
	private static void solve() {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		long ans = 0;
		for(int i = 1;i<=n;i++) {
			String numStr = String.valueOf(i);
			if(numStr.contains("2")||numStr.contains("0")||
				numStr.contains("1")||numStr.contains("9")){
				ans+=i;
			}
		}
		System.out.println(ans);
			
		reader.close();
	}

}
