package Day60;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int k = reader.nextInt();
		int r = reader.nextInt();
		
		for(int i = 1;i<10;i++) {
			if(k*i%10==0||k*i%10==r) {
				System.out.println(i);
				break;
			}
		}
		
		reader.close();
	}
	
	
}
