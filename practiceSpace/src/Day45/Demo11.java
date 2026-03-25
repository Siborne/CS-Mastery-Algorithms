package Day45;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo11 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int t = reader.nextInt();
		Map<String, Integer> map = new HashMap<>();
		while(t-->0) {
			int op = reader.nextInt();
			if(op==1) {
				String name = reader.next();
				int score = reader.nextInt();
				map.put(name, score);
				System.out.println("OK");
			}else if(op==2) {
				String name = reader.next();
				if(map.containsKey(name)) {
					System.out.println(map.get(name));
				}else {
					System.out.println("Not found");
				}
			}else if(op==3) {
				String name = reader.next();
				if(map.containsKey(name)) {
					map.remove(name);
					System.out.println("Deleted successfully");
				}else {
					System.out.println("Not found");
				}
			}else {
				System.out.println(map.size());
			}
		}
	}
	
}
