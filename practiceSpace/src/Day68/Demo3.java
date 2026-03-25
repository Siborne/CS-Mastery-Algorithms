package Day68;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int t= reader.nextInt();
		while(t-->0) {
			int n = reader.nextInt();
			int ji = 0;
			int ou = 0;
			while(n-->0) {
				int x = reader.nextInt();
				if(x%2==1) {
					ji++;
				}else {
					ou++;
				}
			}
			
			if((ji+ou*2)%2==1) {
				System.out.println("NO");
			}else {
				int mind = (ji+2*ou)/2;
				if(mind%2!=0&&ji==0) {
					System.out.println("NO");
				}else {
					System.out.println("YES");
				}
			}
			
			
		}
		
		reader.close();
	}
	
}
