package Day84;

import java.util.Scanner;

public class Demo30 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		doubleFunction func = x -> x*(x-1);
		int a = reader.nextInt();
		int b = reader.nextInt();
		double ans = func.f(a+b);
		System.out.println(String.format("%.6f", ans));
		
		reader.close();
	}
	
	interface doubleFunction {
		double f(int x);
	}
	
}
