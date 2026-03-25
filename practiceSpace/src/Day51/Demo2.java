package Day51;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		char[] chs = reader.nextLine().toCharArray();
		int last = -1;
		int sum = 0;
		for(int i = 0;i<chs.length;i++) {
			if(last == -1) {
				last = chs[i]-'0';
				sum=1;
				continue;
			}
			if(last!=(chs[i]-'0')) {
				last = chs[i]-'0';
				sum = 1;
				continue;
			}else {
				sum++;
			}
			if(sum>=7) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
		reader.close();
	}
	
}
