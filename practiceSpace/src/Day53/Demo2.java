package Day53;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int n = reader.nextInt();
		if(n==1) {
			System.out.println("I hate it");
			return;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<n-1;i++) {
			if(i%2==0) {
				sb.append("I hate that ");
			}else {
				sb.append("I love that ");
			}
		}
		if(n%2==0) {
			sb.append("I love it");
		}else {
			sb.append("I hate it");
		}
		
		System.out.println(sb.toString());
		reader.close();
	}
	
}
