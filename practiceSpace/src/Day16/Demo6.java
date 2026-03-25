package Day16;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		String s = reader.nextLine();
		String t = reader.nextLine();
		
		int j = 0;
		int ans = 0;
		for(int i = 0;i<s.length()&&j<t.length();i++) {
			if(s.charAt(i)==t.charAt(j)) {
				j++;
				ans++;
			}
		}
		System.out.println(ans);
		reader.close();
	}

}
