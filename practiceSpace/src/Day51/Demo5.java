package Day51;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int n = reader.nextInt();
		reader.nextLine();
		char[] chs = reader.nextLine().toCharArray();
		int ansA = 0;
		for(int i = 0;i<n;i++) {
			if(chs[i]=='A') {
				ansA++;
			}
		}
		System.out.println(ansA==n-ansA?"Friendship":
			(ansA>n-ansA?"Anton":"Danik"));
		reader.close();
	}
	
}
