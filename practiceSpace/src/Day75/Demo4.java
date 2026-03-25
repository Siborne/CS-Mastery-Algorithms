package Day75;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String[] str = reader.nextLine().split(",");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int c = a+b;
		int d = a-b;
		System.out.println(a+"+"+b+"="+c);
		System.out.println(a+"-"+b+"="+d);
		
		reader.close();
	}
	
}
