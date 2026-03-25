package s2025;
import java.util.Scanner;

public class T2 {
	public static void main(String[] args) {
		Scanner reader  = new Scanner(System.in);
		
		int a = reader.nextInt();
		int b = reader.nextInt();
		int c = reader.nextInt();
		if(a>b) {
			if(c==0) {
				System.out.println(b+" MM");
			}else {
				System.out.println(b+" DD");
			}
		}else {
			if(c==0) {
				System.out.println(b+" JJ");
			}else {
				System.out.println(b+" GG");
			}
		}
		
		reader.close();
	}
}
