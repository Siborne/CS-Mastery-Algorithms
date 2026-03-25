package Day1;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		String str = reader.nextLine();
		int maxlen = 0;
		for(int i = 0;i<str.length();i++) {
			int len1 = numLen(str, i, i);
			int len2 = numLen(str, i, i+1);
			maxlen = Math.max(maxlen, Math.max(len1, len2));
		}
		
		System.out.println(maxlen);
		reader.close();
	}

	public static int numLen(String s,int left,int right) {
		while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)) {
			left--;
			right++;
		}
		return right-left-1;
	}
}
