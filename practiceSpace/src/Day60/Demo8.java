package Day60;

import java.util.Scanner;

public class Demo8 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int a = reader.nextInt();
		int b = reader.nextInt();
		int min = Math.min(a, b);
		if(a<b) {
			int temp = (b -min)/2;
			System.out.println(min+" "+temp);
		}else {
			int temp = (a-min)/2;
			System.out.println(min+" "+temp);
		}
		
		reader.close();
	}
	
}
