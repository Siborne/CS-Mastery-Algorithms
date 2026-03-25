package Day67;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int ans = 0;
		int count = 0;
		for(int i = 1;i<=100000;i++) {
			count+=i;
			if(n<count) {
				break;
			}
			n -=count;
			ans++;
		}
		System.out.println(ans);
		reader.close();
	}

}
