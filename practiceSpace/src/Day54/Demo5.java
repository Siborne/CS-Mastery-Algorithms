package Day54;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Demo5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		String line = reader.nextLine();
		Set<Character> set = new HashSet<>();
		for(int i = 0;i<line.length();i++) {
			char ch = line.charAt(i);
			if(ch>='a'&&ch<='z') {
				set.add(ch);
			}
		}
		System.out.println(set.size());
		reader.close();
	}
	
}
