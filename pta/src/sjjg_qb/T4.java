package sjjg_qb;

import java.math.BigInteger;
import java.util.Scanner;

public class T4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		String line = reader.nextLine();
		BigInteger a = new BigInteger(line);
		int len1 = line.length();
		BigInteger b2 = a.multiply(BigInteger.valueOf(2));
//		System.out.println(b2);
		String line2 = b2.toString();
		int len2 = line2.length();
		boolean flag = true;
		if (len1 < len2) {
			flag = false;
		}

		if (flag) {
			int[] arr = new int[10];
			for (int i = 0; i < len1; i++) {
				arr[line.charAt(i) - '0']++;
			}

			int[] brr = new int[10];
			for (int i = 0; i < len2; i++) {
				brr[line2.charAt(i) - '0']++;
			}
			
			for(int i = 0;i<10;i++) {
				if(arr[i]!=brr[i]) {
					flag = false;
					break;
				}
			}
			
		}

		System.out.println(flag ? "Yes" : "No");
		System.out.println(line2);
		reader.close();
	}

}
