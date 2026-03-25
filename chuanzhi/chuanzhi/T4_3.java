package chuanzhi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class T4_3 {
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int t = reader.nextInt();
		while(t-->0) {
			int l = reader.nextInt();
			int r = reader.nextInt();
			boolean flag = false;
			for(int i = r;i>=l;i--) {
				if(testNum(i)) {
					System.out.println(i);
					flag = true;
					break;
				}
			}
			if(!flag) {
				System.out.println(-1);
			}
		}
	}
	
	private static boolean testNum(int num) {
		int[] arr = new int[9];
		return false;
	}
}
