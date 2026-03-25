package Day14;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		reader.nextLine();
		while (n-- > 0) {
			String line = reader.nextLine();
			test(line);
		}
	}

	public static void test(String line) {
		char[] chs = line.toCharArray();
		int l = 0;
		int r = chs.length - 1;
		while(l<=r) {
			if(chs[l]==chs[r]) {
				l++;
				r--;
				continue;
			}
			if(chs[r]=='l'||chs[r]=='q'||chs[r]=='b') {
				r--;
				continue;
			}
			if(chs[l]!=chs[r]) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}

}
