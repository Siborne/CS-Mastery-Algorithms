package Day35;

import java.util.HashSet;
import java.util.Set;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1;i<=100;i++) {
			String str = String.valueOf(i*i)+String.valueOf(i*i*i);
			if(str.length()==10) {
				Set<Character> set = new HashSet<>();
				for(int j = 0;j<str.length();j++) {
					set.add(str.charAt(j));
				}
				
				if(set.size()==10) {
					System.out.println(i);
					return;
				}
			}
		}
	}

}
