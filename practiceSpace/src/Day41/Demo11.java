package Day41;

import java.util.Arrays;
import java.util.Scanner;

public class Demo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		String str = reader.nextLine();
		if(str.length()<8) {
			System.out.println(0);
			return;
		}
		int n = reader.nextInt();
		reader.nextLine();
		
		int ans = 0;
		while(n-->0) {
			char[] t = reader.nextLine().toCharArray();
			Arrays.sort(t);
			for(int j = 0;j<=str.length()-8;j++) {
				char[] temp = str.substring(j,j+8).toCharArray();
				Arrays.sort(temp);
				if(Arrays.equals(temp, t)) {
					ans++;
				}
			}
		}
		
		
		System.out.println(ans);
		reader.close();
	}

}
