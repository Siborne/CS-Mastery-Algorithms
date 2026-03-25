package Day18;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int sum = n;
		Map<Integer, Integer> map = new HashMap<>();
		while(n-->0) {
			int x = reader.nextInt();
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		
		int max = Integer.MIN_VALUE;
		for(int num:map.values()) {
			max = Math.max(max, num);
		}
		System.out.println(sum-max);
	}

}
