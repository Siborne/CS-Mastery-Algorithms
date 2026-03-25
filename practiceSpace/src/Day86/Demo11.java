package Day86;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Demo11 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String str = reader.nextLine();
		int n = str.length();
		Set<String> set = new HashSet<>();
		for(int i = 0;i<n;i++) {
			for(int j = i+1;j<n+1;j++) {
				set.add(str.substring(i,j));
			}
		}
		System.out.println(set.size());
		reader.close();
	}
	
}
