package Day65;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int n = reader.nextInt();
		int m = reader.nextInt();
		List<Integer> list = eulerSieve(50);
		if(list.contains(n)&&list.contains(m)&&list.get(list.indexOf(n)+1)==m) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
		reader.close();
	}
	
	private static List<Integer> eulerSieve(int x) {
		boolean[] arr = new boolean[x+1];
		List<Integer> list = new ArrayList<>();
		Arrays.fill(arr, true);
		
		for(int i = 2;i<=x;i++) {
			if(arr[i]) {
				list.add(i);
			}
			
			for(int j = 0;j<list.size()&&i*list.get(j)<=x;j++) {
				arr[i*list.get(j)] = false;
				if(i%list.get(j)==0) {
					break;
				}
			}
		}
		
		return list;
	}
	
}
