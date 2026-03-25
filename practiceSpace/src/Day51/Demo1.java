package Day51;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String numStr = reader.nextLine();
		int ans = 0;
		for(int i = 0;i<numStr.length();i++) {
			if(numStr.charAt(i)!='4'&&numStr.charAt(i)!='7') {
				System.out.println("NO");
				return;
			}else {
				ans++;
			}
		}
		
		System.out.println(ans==4||ans==7?"YES":"NO");
		reader.close();
	}
	
}
