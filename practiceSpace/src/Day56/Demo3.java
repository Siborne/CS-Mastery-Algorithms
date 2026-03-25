package Day56;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int t = reader.nextInt();
//		reader.nextLine();
		while(t-->0) {
			int n = reader.nextInt();
			Map<Integer, Integer> map = new HashMap<>();
			String line = String.valueOf(n);
			
			for(int i = 0;i<line.length();i++) {
				int k = (int)Math.pow(10, line.length()-i-1);
				int first = (line.charAt(i)-'0');
				
				int num = first*k;
				if(num!=0) {
					map.put(num, 1);
				}
			}
			
			System.out.println(map.size());
			StringBuilder sb = new StringBuilder();
			for(int key : map.keySet()) {
				sb.append(key).append(" ");
			}
			System.out.println(sb.toString());
			
			
		}
		
		reader.close();
	}
	
}
