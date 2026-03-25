package s2025;
import java.util.Scanner;

public class T3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int t = reader.nextInt();
		while(t-->0) {
			int x = reader.nextInt();
			if(x==1) {
				System.out.println("gugugu");
			}else if(x==2) {
				System.out.println("gagaga");
			}else if(x==3) {
				System.out.println("jijiji");
			}else if(x==4) {
				System.out.println("miaomiaomiao");
			}else if(x==5) {
				System.out.println("wangwangwang");
			}
		}
		
		reader.close();
	}
	
}
