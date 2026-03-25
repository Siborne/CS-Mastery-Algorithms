package Day69;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int t = reader.nextInt();
		while(t-->0){
			int a = reader.nextInt();
			int b = reader.nextInt();
			int min = Math.min(Math.max(a,2*b), Math.max(a*2, b));
			System.out.println(min*min);
		}
		
		reader.close();
	}
	
}
