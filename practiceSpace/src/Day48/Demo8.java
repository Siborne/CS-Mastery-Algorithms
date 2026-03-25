package Day48;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo8 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<>();
		int t = reader.nextInt();
		reader.nextLine();
		while(t-->0) {
			String[] str = reader.nextLine().split("\\s+");
			if(str[0].equals("find")) {
				System.out.println(map.getOrDefault(str[1], 0));
			}else {
				map.put(str[2], map.getOrDefault(str[2], 0)+1);
			}
		}
		
		reader.close();
	}
	
}
