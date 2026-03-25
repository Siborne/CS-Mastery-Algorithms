package rms_30;

import java.util.Scanner;

public class T1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int ans = 0;
		for(int i = 1;i<=7;i+=2) {
			ans+=i;
		}
		
		System.out.println(ans);
		reader.close();
	}
	
}
