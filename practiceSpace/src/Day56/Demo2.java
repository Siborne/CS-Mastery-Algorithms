package Day56;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		char[] chs1 = reader.nextLine().toCharArray();
		char[] chs2 = reader.nextLine().toCharArray();
		char[] chs3 = reader.nextLine().toCharArray();

		Map<Character, Integer> map = new HashMap<>();
		
		for(char ch: chs3) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		for(char ch:chs1) {
			if(map.getOrDefault(ch,0)==0) {
				System.out.println("NO");
				return;
			}else {
				map.put(ch, map.getOrDefault(ch, 0)-1);
			}
		}
		
		for(char ch:chs2) {
			if(map.getOrDefault(ch,0)==0) {
				System.out.println("NO");
				return;
			}else {
				map.put(ch, map.getOrDefault(ch, 0)-1);
			}
		}
		
		for(char a : map.keySet()) {
			if(map.get(a)!=0) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
//		if(map.size()==0) {
//			System.out.println("YES");
//		}else {
//			System.out.println("NO");
//		}
		
		reader.close();
	}

}
