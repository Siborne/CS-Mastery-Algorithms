package Day67;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int t = reader.nextInt();
		while(t-->0) {
			int n = reader.nextInt();
			Map<Character, Integer> map = new HashMap<>();
			char[] chs = reader.next().toCharArray();
			for(int i = 0;i<n;i++) {
				map.put(chs[i], map.getOrDefault(chs[i], 1)+1);
			}
			int sum = 0;
			for(int num:map.values()) {
				sum+=num;
			}
			System.out.println(sum);
		}
		
		
		reader.close();
	}
	
}
