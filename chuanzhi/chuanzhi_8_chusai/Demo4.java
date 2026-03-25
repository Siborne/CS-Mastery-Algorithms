package chuanzhi_8_chusai;

import java.util.Scanner;

public class Demo4 {

	private static final long MOD = 10007;

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		String s = reader.nextLine();
		int len = s.length();
		long aXi = 1;
		int flag = s.charAt(2) == '-' ? -1 : 1;
		long numXi = (s.charAt(3) - '0') * flag;

		for (int i = 5; i < len; i += 5) {
			flag = s.charAt(i + 2) == '-' ? -1 : 1;
			long numXi2 = (s.charAt(i + 3) - '0') * flag;
			aXi = ((aXi * numXi2) % MOD + numXi) % MOD;
			numXi = (numXi * numXi2) % MOD;
//			System.out.println("-----");
//			System.out.println(aXi+" "+numXi);
		}

		System.out.println(aXi % MOD);
		reader.close();
	}

}
