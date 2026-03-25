package Day68;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int t = reader.nextInt();
		while(t-->0) {
			int n = reader.nextInt();
			int sy = n%3;
			if(sy==0) {
				System.out.println(n+" "+n);
			}else if(sy==1){
				System.out.println((n+1)+" "+n);
			}else {
				System.out.println(n+" "+(n+1));
			}
		}
		
		reader.close();
	}
	
}
