package Day86;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		reader.nextLine();
		while (t-- > 0) {
			char[] chs = reader.nextLine().toCharArray();
			int ans = 0;
			int sum0 = 0;
			int sum1 = 0;
			for(int i = 0;i<chs.length;i++) {
				if(chs[i] == '0') {
					sum0++;
				}else {
					sum1++;
				}
			}
			ans = Math.min(sum0, sum1);
			if(ans%2==0) {
				System.out.println("NET");
			}else {
				System.out.println("DA");
			}
		}

		reader.close();
	}

}
