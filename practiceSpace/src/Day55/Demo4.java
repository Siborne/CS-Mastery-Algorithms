package Day55;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
//		Set<String> set = new HashSet<>();
		Map<String, Integer> map = new HashMap<>();
		reader.nextLine();
		while(n-->0) {
			String line = reader.nextLine();
			if(map.getOrDefault(line, 0)==0) {
				map.put(line, 1);
				System.out.println("OK");
			}else {
				map.put(line, map.get(line)+1);
				System.out.println(line +(map.get(line)-1));
			}
		}
		

		reader.close();
	}
	
}
