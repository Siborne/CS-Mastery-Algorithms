package Day45;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Demo10 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int m = reader.nextInt();
		TreeSet<Integer> set = new TreeSet<>();
		while(m-->0) {
			int op = reader.nextInt();
			int t = reader.nextInt();
			if(op==1) {
				if(!set.add(t)) {
					System.out.println("Already Exist");
				}
			}else {
				if(set.isEmpty()) {
					System.out.println("Empty");
					continue;
				}
				
				if(set.contains(t)) {
					System.out.println(t);
					set.remove(t);
				}else {
					 Integer lower = set.lower(t);
					 Integer higher = set.higher(t);
					 
					 if(lower==null&&higher==null) {
						 System.out.println("Empty");
					 }else if(lower == null) {
						 System.out.println(higher);
						 set.remove(higher);
					 }else if(higher == null) {
						 System.out.println(lower);
						 set.remove(lower);
					 }else {
						 if(higher-t<t-lower) {
							 System.out.println(higher);
							 set.remove(higher);
						 }else {
							 System.out.println(lower);
							 set.remove(lower);
						 }
					 }
				}
				
			}
			
		}
		
		
		reader.close();
	}
	
}
