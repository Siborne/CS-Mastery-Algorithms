package Day62;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int n = reader.nextInt();
		int m = reader.nextInt();
		System.out.println(Math.min(n, m)%2==0?"Malvika":"Akshat");
		
		reader.close();
	}
	
}
