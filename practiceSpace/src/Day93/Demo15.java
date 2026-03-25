package Day93;

import java.util.Scanner;

public class Demo15 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int n = reader.nextInt();
		String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
		StringBuilder sb = new StringBuilder();
		if(n==0) {
			sb.append("零元整");
		}else if(n<10) {
			sb.append(arr[n]).append("元整");
		}else {
			int tens = n/10;
			int ones = n%10;
			if(tens == 1) {
				sb.append("拾");
			}else {
				sb.append(arr[tens]).append("拾");
			}
			
			if(ones == 0) {
				sb.append("元整");
			}else {
				sb.append(arr[ones]).append("元整");
			}
		}
		System.out.println(sb.toString());
		reader.close();
	}
	
}
