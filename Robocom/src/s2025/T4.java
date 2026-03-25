package s2025;
import java.util.Scanner;

public class T4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		reader.nextLine();
		String[] ts = new String[n];
		for(int i = 0;i<n;i++) {
			ts[i] = reader.nextLine();
		}
		String line = reader.nextLine();
		StringBuilder sb = new StringBuilder(line);
		for(String t:ts) {
			int x = 0;
			while(x!=-1) {
				int l = sb.indexOf(t, x);
				if(l==-1) {
					break;
				}
//				System.out.println(l);
				sb.insert(l, "*");
				sb.insert(l+t.length()+1, "*");
//				System.out.println(sb);
				x = l+2;
			}
		}
		System.out.println(sb.toString());
		
		reader.close();
	}
	
}
