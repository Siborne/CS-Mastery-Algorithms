package Day52;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		Set<String> set = new HashSet<>();
		int ans = 0;
		for(int i = 0;i<4;i++) {
			if(!set.add(reader.next())) {
				ans++;
			}
		}
		System.out.println(ans);
		reader.close();
	}
	
}
