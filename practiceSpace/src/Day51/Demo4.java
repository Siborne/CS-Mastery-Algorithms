package Day51;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int n = reader.nextInt();
		int k = reader.nextInt();
		while(k-->0) {
			int temp = n%10;
			if(temp!=0) {
				n--;
			}else {
				n/=10;
			}
		}
		System.out.println(n);
		reader.close();
	}
	
}
