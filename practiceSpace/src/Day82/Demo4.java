package Day82;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Demo4 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int n = reader.nextInt();
		int[] a = new int[n+2];
		int[] s = new int[n+2];
		Set<Integer> set = new HashSet<>();
		int m = reader.nextInt();
		for(int i = 1;i<=n;i++) {
			a[i] = reader.nextInt();
		}
		for(int i = n;i>=1;i--) {
			set.add(a[i]);
			s[i] = set.size();
		}
		
		while(m-->0) {
			int l = reader.nextInt();
			System.out.println(s[l]);
		}
		
		
		reader.close();
	}
	
}
