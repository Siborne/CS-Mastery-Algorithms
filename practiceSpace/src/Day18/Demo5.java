package Day18;

import java.util.HashSet;
import java.util.Set;

public class Demo5 {

	public static void main(String[] args) {
		String str = "0100110001010001";
		Set<String> set = new HashSet<>();
		for(int i = 0;i<str.length();i++) {
			for(int j = i+1;j<str.length()+1;j++) {
				set.add(str.substring(i,j));
			}
		}
		System.out.println(set.size());
	}
}
