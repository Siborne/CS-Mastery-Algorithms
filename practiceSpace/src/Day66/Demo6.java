package Day66;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int t = reader.nextInt();
		Map<Integer, Integer> map = new HashMap<>();
		
		int temp = 0;
		for(int i = 1;i<=9;i++) {
			StringBuilder sb = new StringBuilder();
			
			for(int j = 1;j<5;j++) {
				temp+=j;
				sb.append(i);
				map.put(Integer.valueOf(sb.toString()), temp);
			}
		}
		
		while (t-- > 0) {
			int x = reader.nextInt();
			System.out.println(map.get(x));
		}

		reader.close();
	}

}
