package Day38;

import java.util.Scanner;

public class Demo16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader  = new Scanner(System.in);
		long n = reader.nextLong();
		long ans = 0;
		long weight = 0;
		while(weight<n) {
			weight+=(int)(Math.pow(3, ans));
			ans++;
		}
		System.out.println(ans);
		reader.close();
	}

}
