package Day54;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int n = reader.nextInt();
		reader.nextLine();
		int ans = 0;
		while(n-->0) {
			String line = reader.nextLine();
			if(line.equals("Tetrahedron")) {
				ans+=4;
			}else if(line.equals("Cube")) {
				ans+=6;
			}else if(line.equals("Octahedron")) {
				ans+=8;
			}else if(line.equals("Dodecahedron")) {
				ans+=12;
			}else if(line.equals("Icosahedron")) {
				ans+=20;
			}
		}
		
		System.out.println(ans);
		reader.close();
	}
	
}
