package Day70;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Demo8 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int n = reader.nextInt();
		int m = reader.nextInt();
		Set<String> set = new HashSet<>();
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<m;j++) {
				String s = reader.next();
				set.add(s);
			}
		}
		if(set.contains("C")||set.contains("M")||
				set.contains("Y")) {
			System.out.println("#Color");
		}else {
			System.out.println("#Black&White");
		}
		
		reader.close();
	}
	
}
