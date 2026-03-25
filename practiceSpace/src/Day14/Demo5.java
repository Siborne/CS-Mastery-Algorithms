package Day14;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int ans = 0;
		while(n-->0) {
			long num = reader.nextLong();
			while(num%2==0&&num>1) {
				num/=2;
			}
			if(num==1) {
				ans++;
			}
		}
		System.out.println(ans);
	}

}
