package Day75;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo41 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int t = reader.nextInt();
		while(t-->0) {
			int n = reader.nextInt();
			Map<Integer, Integer> map = new HashMap<>();
			while(n-->0) {
				int x = reader.nextInt();
				map.put(x, map.getOrDefault(x, 0)+1);
			}
			boolean flag = false;
			
			for(int key:map.keySet()) {
				int x = map.get(key);
				if(x>=3) {
					System.out.println(key);
					flag = true;
					break;
				}
			}
			
			if(!flag) {
				System.out.println(-1);
			}
		}
		
		reader.close();
	}
	
}
