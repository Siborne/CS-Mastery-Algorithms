package Day37;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}
	
	private static void solve() {
		Scanner reader = new Scanner(System.in);
		String paperName = reader.nextLine();
		int x = 1189;
		int y = 841;
		int count = paperName.charAt(1)-'0';
		for(int i = 0;i<count;i++) {
			if(x>y) {
				x /= 2;
			}else {
				y /= 2;
			}
		}
		
		if(x>y) {
			System.out.println(x);
			System.out.println(y);
		}else {
			System.out.println(y);
			System.out.println(x);
		}
		
		reader.close();
	}
}
