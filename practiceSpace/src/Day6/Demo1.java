package Day6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo1 {
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Map<Integer,Integer> map = new HashMap<>();
		int q = reader.nextInt();
		while(q-->0) {
			String op = reader.next();
			if(op.equals("I")){
				map.put(reader.nextInt(), 1);
			}else{
				if(map.getOrDefault(reader.nextInt(),0)==0) {
					System.out.println("No");
				}else {
					System.out.println("Yes");
				}
			}
		}
	}
	
}
