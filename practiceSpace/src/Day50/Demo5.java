package Day50;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int x = reader.nextInt();
		
		System.out.println(x/5+(x%5==0?0:1));
		reader.close();
	}
	
}
