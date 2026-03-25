package Day36;

import java.io.Reader;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		solve();
		reader.close();
	}
	
	private static void solve() {
		int s = 0;
		for(int i = 0;i<20;i++) {
			s = s * 2 + 1;
		}
		int w = (int)Math.pow(2, 19);
		System.out.println(s+"/"+w);
	}

}
