package Day14;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		long ans = 0;
		for(int i = 1;i<=20230408;i++) {
			ans+=i;
		}
		System.out.println(ans);
		reader.close();
	}

}
