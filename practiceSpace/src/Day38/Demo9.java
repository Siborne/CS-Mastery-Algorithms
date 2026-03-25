package Day38;

import java.util.Scanner;

public class Demo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int a = 0;
		int b = 0;
		for(int i = 0;i<n;i++) {
			int x = reader.nextInt();
			if(x>=85) {
				a++;
			}
			if(x>=60) {
				b++;
			}
		}
		double an = (a*100.0)/n;
		double bn = (b*100.0)/n;
		System.out.printf("%.0f",bn);
		System.out.println("%");
		System.out.printf("%.0f",an);
		System.out.println("%");
		reader.close();
	}

}
