package Day75;

import java.util.Scanner;

public class Demo42 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int n = reader.nextInt();
		int m = reader.nextInt();
		int time = 0;
		while(n>0) {
			n--;
			time++;
			if(time%m==0) {
				n++;
			}
		}
		System.out.println(time);
				
				
		
		reader.close();
	}
	
}
