package Day35;

import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);;
		int ans = reader.nextInt();
		int pg = ans;
		while(pg/3!=0) {
			int temp = pg/3;
			ans += temp;
			pg%=3;
			pg+=temp;
		}
		System.out.println(ans);
	}

}
