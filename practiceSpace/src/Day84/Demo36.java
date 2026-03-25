package Day84;

import java.util.Scanner;

public class Demo36 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int n = reader.nextInt();
		if(n<10) {
			System.out.println(n+"小于10");
		}else if(n==10) {
			System.out.println(n+"等于10");
		}else {
			System.out.println(n+"大于10");
		}
		
		reader.close();
	}
	
}
