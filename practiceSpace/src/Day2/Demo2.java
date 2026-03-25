package Day2;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int count = reader.nextInt();
		reader.nextLine();
		while(count-->0) {
			System.out.println(test(reader.nextLine())?"Yes":"No");
			
		}
	}
	
	public static boolean test(String s) {
		int l = 0;
		int r = s.length()-1;
		char[] chs = s.toCharArray();
		while(l<r) {
			if(chs[l] == chs[r]) {
				l++;
				r--;
			}else {
				if(chs[r] == 'l' || chs[r]=='q'||chs[r]=='b') {
					r--;
				}else {
					return false;
				}
			}
		}
		return true;
	}

}
