package Day62;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo13 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		List<Integer> list3 = new ArrayList<>();
		
		for(int i = 1;i<=n;i++) {
			int x = reader.nextInt();
			if(x==1) {
				list1.add(i);
			}else if(x==2) {
				list2.add(i);
			}else if(x==3) {
				list3.add(i);
			}
		}
		int maxSize = Math.min(list1.size(), Math.min(list2.size(), list3.size()));
		System.out.println(maxSize);
		
		for(int i = 0;i<maxSize;i++) {
			System.out.println(list1.get(i)+" "+list2.get(i)+" "+list3.get(i));
		}
		
		reader.close();
	}
	
}
