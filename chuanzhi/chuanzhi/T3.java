package chuanzhi;

import java.util.Scanner;

public class T3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int t = reader.nextInt();
		while(t-->0) {
			int x = reader.nextInt();
			
		}
		
	}
	
	private static int gcd(int x,int y) {
		if(y==0) {
			return x;
		}
		return gcd(y,x%y);
	}

}
