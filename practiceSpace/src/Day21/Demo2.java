package Day21;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		long ans = 0;
		int l = 0;
		int u = 0;
		int c = 0;
		int k = 0;
		int n = reader.nextInt();
		reader.nextLine();
		char[] chs = reader.nextLine().toCharArray();
		for (char ch : chs) {
			if (ch == 'l') {
				l++;
			}else if(ch=='u') {
				u++;
			}else if(ch=='c'){
				c++;
			}else if(ch=='k') {
				k++;
			}
		}
		ans = (long)l*u*c*k;
		System.out.println(ans);
		reader.close();
	}

}
