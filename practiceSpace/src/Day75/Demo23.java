package Day75;

import java.util.Scanner;

public class Demo23 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int x = reader.nextInt();
		long ans = (long)(Math.pow(x, 6)-2*Math.pow(x, 5)+3*Math.pow(x, 4)-5*Math.pow(x, 2)+6*x+7);
		System.out.println(ans);
		reader.close();
	}
	
}
