package Day75;

import java.util.Scanner;

public class Demo16 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		String line = reader.nextLine();
		
		for(int i = 0;i<line.length()&&i+3<=line.length();) {
			System.out.print(line.substring(i,i+3)+" ");
			i+=3;
		}
		
		reader.close();
	}
	
}
