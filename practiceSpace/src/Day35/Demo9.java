package Day35;

import java.util.HashSet;
import java.util.Set;

public class Demo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set = new HashSet<>();
		
		for(int i = 10;i<=99;i++) {
			int n = i*i;
			set.add(n%100);
		}
		
		System.out.println(set.size());
	}

}
