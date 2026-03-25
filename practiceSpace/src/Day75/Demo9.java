package Day75;

import java.util.Scanner;

public class Demo9 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		String[] strs = reader.nextLine().split(",");
		
		for(int i = 0;i<strs.length;i++) {
			System.out.println("The ASCII code of "+strs[i]+" is "+(int)strs[i].charAt(0));
		}
		
		reader.close();
	}
	
}
