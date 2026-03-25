package s2025;
import java.util.Scanner;

public class T5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int r1 = reader.nextInt();
		int r2 = reader.nextInt();
		int sr1 = reader.nextInt();
		int sr2 = reader.nextInt();
		int ssr1 = reader.nextInt();
		int ssr2 = reader.nextInt();
		int ur1 = reader.nextInt();
		int ur2 = reader.nextInt();
		int lr = reader.nextInt();
		r2 += r1/2;
		r1 %=2;
		sr1 += r2/3;
		r2 %= 3;
		
		sr2 += sr1/2;
		sr1 %=2;
		ssr1 += sr2/3;
		sr2 %=3;
		
		ssr2 += ssr1/2;
		ssr1 %=2;
		ur1 += ssr2/3;
		ssr2 %=3;
		
		ur2 += ur1/2;
		ur1 %= 2;
		lr += ur2/3;
		ur2 %= 3;
		System.out.println(r1+" "+ r2+" "+sr1+" "+sr2 +" "+ ssr1+" "+ssr2+" "+ur1+" "+ur2+" "+lr);
	}
	
}
