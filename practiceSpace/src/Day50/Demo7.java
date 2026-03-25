package Day50;

import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		int k = reader.nextInt();
		int n = reader.nextInt();
		int w = reader.nextInt();
		
		long ans = 0;
		for(int i = 1;i<=w;i++) {
			ans+=k*i;
		}
		System.out.println(ans-n);
		reader.close();
	}

}
