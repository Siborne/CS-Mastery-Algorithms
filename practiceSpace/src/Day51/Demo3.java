package Day51;

import java.util.Scanner;

public class Demo3 {
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int n = reader.nextInt();
		int countX = 0;
		int countY = 0;
		int countZ = 0;
		for(int i = 0;i<n;i++) {
			countX += reader.nextInt();
			countY += reader.nextInt();
			countZ += reader.nextInt();
		}
		System.out.println(countX==countY&&countY==countZ?"YES":"NO");
		reader.close();
	}
	
}
