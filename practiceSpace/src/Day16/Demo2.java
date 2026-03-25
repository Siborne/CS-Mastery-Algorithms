package Day16;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Demo2 {
	public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	public static PrintWriter writer = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(reader.readLine());

		while (n-- > 0) {
			String s = reader.readLine();
			int l = s.length();
			for (int i = s.length() - 1; i >= 0; i--) {
				char c = s.charAt(i);
				if (c == 'l' || c == 'q' || c == 'b') {
					l = i;
				} else {
					break;
				}
			}
			
			int r = -1;
			for(int i = 0;i<s.length();i++) {
				char c = s.charAt(i);
				if(c==108||c==113||c==98) {
					r = i;
				}else {
					break;
				}
			}
			int len1 = r+1;
			int len2 = s.length()-l;
			
			boolean flag;
			
			if(len1<=len2) {
				flag = check(s,len1,len2);
			}else {
				flag = false;
			}
			
			if(flag) {
				writer.println("Yes");
			}else {
				writer.println("No");
			}
		}

		writer.flush();
		writer.close();
		reader.close();
	}

	public static boolean check(String s,int len1,int len2) {
		int l = 0;
		int r = s.length()-len2+len1-1;
		while(l<=r) {
			if(s.charAt(l)!=s.charAt(r)) {
				return false;
			}
			l++;
			r--;
		}
		return true;
	}
	
}
