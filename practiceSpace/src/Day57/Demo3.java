package Day57;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner reader= new Scanner(System.in);
		
		int n = reader.nextInt();
		Map<Integer, Integer> map = new HashMap<>();
		int ans = -1;
		int temp = 0;
		for(int i = 0;i<n;i++) {
			int x = reader.nextInt();
			if(x==1) {
				temp--;
			}else {
				temp++;
			}
			
		}
		
		reader.close();
	}
	
}
