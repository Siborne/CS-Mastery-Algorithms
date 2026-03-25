package Day49;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Demo3 {
	public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        Set<Character> set = new HashSet<>();
        char[] chs = reader.nextLine().toCharArray();
        for(char ch:chs) {
        	set.add(ch);
        }
        if((set.size()&1)==1) {
        	System.out.println("IGNORE HIM!");
        }else {
        	System.out.println("CHAT WITH HER!");
        }
        reader.close();
    }
}
