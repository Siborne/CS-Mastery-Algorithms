package Day17;

import java.util.Scanner;

public class Demo1 {
	public static int mod = (int)1e9+7;
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		long n = reader.nextLong();
		long ans = 0;
		n--;
		for(long i = 1;i<=n;i++) {
			ans+=(n-i+1)*(n-i+1)*i;
			ans%=mod;
		}
		System.out.println(ans);;
		reader.close();
	}

}
