package Day76;

import java.util.Scanner;

public class Demo2 {

	private static final double  PI = 3.1415926;
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		float x = reader.nextFloat();
		float y = reader.nextFloat();
		
		float r = (float)Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
		float c = y/x;
		float d = (float)Math.toDegrees(Math.atan(c));
		
		System.out.printf("%.1f %.1f",r,d);
		
		reader.close();
	}
	
}
