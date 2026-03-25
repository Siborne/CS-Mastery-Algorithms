package Day67;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		while (t-- > 0) {
			int n = reader.nextInt();
			String s = reader.next();
			int len = 0;
			for(int i = 0;i<n/2;i++) {
				if(s.charAt(i)=='0'&&s.charAt(n-1-i)=='1') {
					len+=2;
				}else if(s.charAt(i)=='1'&&s.charAt(n-1-i)=='0'){
					len+=2;
				}else {
					break;
				}
			}
			System.out.println(n-len);
		}

		reader.close();
	}

}
