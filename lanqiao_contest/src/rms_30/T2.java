package rms_30;

import java.util.Scanner;

public class T2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int n = reader.nextInt();
		int m = reader.nextInt();

		 if (m <= n) {
	            System.out.println(m);
	        } else {
	            // 计算 M 超过 N 的部分
	            int remaining = m - n;
	            // 每轮从左到右再从右到左，N-1 个数
	            int cycleLength = (n - 1)*2;
	            // 计算已经经过了多少轮
//	            int fullCycles = remaining / cycleLength;
//	            int people = remaining % cycleLength;
	            // 计算在这一轮中报的具体数字
	            int positionInCycle = remaining % cycleLength;

	            if (positionInCycle <= n-1) {
	                // 当前是从左到右报数
	                System.out.println(n-positionInCycle);
	            } else {
	                // 当前是从右到左报数
	                System.out.println(positionInCycle-n+2);
	            }
	        }

		reader.close();
	}

}
