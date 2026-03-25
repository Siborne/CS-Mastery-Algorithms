package Day37;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}
	
	private static void solve() {
		Scanner reader = new Scanner(System.in);
		String numStr = reader.nextLine();
		
		while(numStr.length()>1) {
			int num = 0;
			for(int i = 0;i<numStr.length();i++) {
				num+=numStr.charAt(i)-'0';
			}
			numStr=String.valueOf(num);
		}
		
		System.out.println(numStr);
		
		reader.close();
	}

}
