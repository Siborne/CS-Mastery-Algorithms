package Day75;

import java.util.Scanner;

public class Demo13 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		String[] strs = reader.nextLine().split(",");
		for(String str:strs) {
			String[] s = str.split("=");
			System.out.print(s[1]+" ");
		}
		
		reader.close();
	}
	
}
